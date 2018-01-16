package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Invitation;

public interface InvitationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}