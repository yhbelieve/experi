package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    List findAdmin(Admin admin);
    List getAllUser();
}