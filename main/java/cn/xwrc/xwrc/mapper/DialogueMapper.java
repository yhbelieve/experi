package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Dialogue;

public interface DialogueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dialogue record);

    int insertSelective(Dialogue record);

    Dialogue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dialogue record);

    int updateByPrimaryKey(Dialogue record);
}