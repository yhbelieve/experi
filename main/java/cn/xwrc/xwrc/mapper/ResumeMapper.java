package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Resume;
import cn.xwrc.xwrc.pojo.ResumeWithBLOBs;

public interface ResumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeWithBLOBs record);

    int insertSelective(ResumeWithBLOBs record);

    ResumeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResumeWithBLOBs record);

    int updateByPrimaryKey(Resume record);
}