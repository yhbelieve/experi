package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Apply;

public interface ApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}