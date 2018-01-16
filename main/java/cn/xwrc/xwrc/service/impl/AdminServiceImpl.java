package cn.xwrc.xwrc.service.impl;

import cn.xwrc.xwrc.mapper.*;
import cn.xwrc.xwrc.pojo.*;
import cn.xwrc.xwrc.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 豪 on 2016/12/9.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private CompantMapper compantMapper;
    @Resource
    private DialogueMapper dialogueMapper;
    @Resource
    private ApplyMapper applyMapper;
    @Resource
    private JobsMapper jobsMapper;
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(ResumeWithBLOBs record) {
        return resumeMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(JobsWithBLOBs record) {
        return jobsMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(Dialogue record) {
        return dialogueMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(Apply record) {
        return applyMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(Compant record) {
        return compantMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

    @Override
    public List findAdmin(Admin admin) {
        return adminMapper.findAdmin(admin);
    }

    @Override
    public List getAllUser() {
        System.out.println("11111111111");
        System.out.println("11112342341111111");
        return adminMapper.getAllUser();
    }

    @Override
    public List getAllCompany() {
        return compantMapper.getAllCompany();
    }

    @Override
    public int updateByPrimaryKeySelective(Compant record) {
        return compantMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List findCompany(Compant compant) {
        return compantMapper.findCompany(compant);
    }


}
