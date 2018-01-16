package cn.xwrc.xwrc.mapper;


import cn.xwrc.xwrc.pojo.Jobs;
import cn.xwrc.xwrc.pojo.JobsWithBLOBs;

public interface JobsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobsWithBLOBs record);

    int insertSelective(JobsWithBLOBs record);

    JobsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobsWithBLOBs record);

    int updateByPrimaryKey(Jobs record);
}