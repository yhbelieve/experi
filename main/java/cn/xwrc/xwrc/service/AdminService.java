package cn.xwrc.xwrc.service;

import cn.xwrc.xwrc.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/9.
 */
public interface AdminService {


    int insertSelective(User record);


    int insertSelective(ResumeWithBLOBs record);

    int insertSelective(JobsWithBLOBs record);


    int insertSelective(Dialogue record);

    int insertSelective(Apply record);

    int insertSelective(Compant record);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    List findAdmin(Admin admin);
    List getAllUser();

    List getAllCompany();


    int updateByPrimaryKeySelective(Compant record);

    List findCompany(Compant compant);
}
