package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Compant;

import java.util.List;

public interface CompantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Compant record);

    int insertSelective(Compant record);

    Compant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Compant record);

    int updateByPrimaryKey(Compant record);
    List findCompany(Compant compant);
    List getAllCompany();
}