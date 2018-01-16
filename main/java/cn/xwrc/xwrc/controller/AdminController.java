package cn.xwrc.xwrc.controller;

import cn.xwrc.xwrc.pojo.*;
import cn.xwrc.xwrc.service.AdminService;
import cn.xwrc.xwrc.utils.DESUtils;
import cn.xwrc.xwrc.utils.DateUtils;
import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleIfStatement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping(value = "Login", method = RequestMethod.GET)
    public String showIndex() {
        System.out.println("后台首页123");
        return "admin/login";
    }
    @RequestMapping(value = "Login", method = RequestMethod.POST)
    public String showIndex(Admin admin, String type, HttpServletRequest request, Model model) {
        System.out.println(type);
        if (type.equals("2")) {//管理员用户登录
            List admin1 = adminService.findAdmin(admin);
            if (admin1.get(0) == null) {
                model.addAttribute("admin", admin);
                model.addAttribute("msg", "用户名或密码错误");
                return "admin/login";
            } else {
                request.getSession().setAttribute("admin", admin1.get(0));
                System.out.println("管理员登录");
//           登录成功，返回显示所有用户的action
                return "admin/index";
            }
        } else if (type.equals("1")) {//企业登录
            Compant compant = new Compant();
            compant.setUsername(admin.getUsername());
            compant.setPassword(admin.getPassword());
            List company = adminService.findCompany(compant);
            if (company == null) {
                model.addAttribute("admin", admin);
                model.addAttribute("msg", "用户名或密码错误");
                return "admin/login";
            } else {
                request.getSession().setAttribute("admin", company);
                System.out.println("企业登录");
                return "admin/index";
            }
        } else {
            model.addAttribute("msg", "非法登录！！！");
            return "admin/login";
        }
    }

    /**
     * 显示所有企业信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "showAllCompany", method = RequestMethod.GET)
    public String getAllCompany(HttpServletRequest request,Model model) {
        List list = adminService.getAllCompany();
        model.addAttribute("list",list);
        System.out.print(list.toString());
        return "admin/index";
    }

    /**
     * 企业入住，1表示企业已经入住，0表示企业没有入住
     * @param request
     * @param model
     * @param company
     * @return
     */
    @RequestMapping(value = "isRuZhu", method = RequestMethod.GET)
    public String isRuZhu(HttpServletRequest request,Model model,Compant company) {
       int a = adminService.updateByPrimaryKeySelective(company);
        model.addAttribute("msg","企业入住修改成功");
        return "admin/index";
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping(value = "Logout", method = RequestMethod.GET)
    public String Logout(HttpSession session) {
        session.invalidate();
        return "redirect:/Admin/Login";
    }
//
//    @RequestMapping(value = "editPassword", method = RequestMethod.POST)
//    public String editPassword(Admin admin, Model model, HttpServletRequest request) {
//        adminService.updateByPrimaryKeySelective(admin);
//        request.getSession().setAttribute("admin", admin);
//        model.addAttribute("msg", "密码修改成功");
//        return "admin/login";
//    }
//

    /**
     * 企业注册
     * @param user
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "Regist", method = RequestMethod.POST)
    public String Regist(Compant user, HttpServletRequest request, Model model) {
        System.out.println(user.toString());
        System.out.println("");
        user.setCreatetime(DateUtils.getNowTime());
        user.setUpdatetime(DateUtils.getNowTime());
        int a = adminService.insertSelective(user);
        System.out.println(a);
        return "admin/index";
    }
    @RequestMapping(value = "Regist", method = RequestMethod.GET)
    public String showRegist(HttpServletRequest request, Model model) {
        return "admin/regist";
    }

    /**
     * 添加简历
     * @param resume
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "addResume", method = RequestMethod.POST)
    public String postResume(ResumeWithBLOBs resume, HttpServletRequest request, Model model) {
        System.out.println(resume.toString());
        System.out.println("");
        resume.setCreatetime(DateUtils.getNowTime());
        resume.setUpdatetime(DateUtils.getNowTime());
        int a = adminService.insertSelective(resume);
        System.out.println(a);
        return "admin/index";
    }


}
