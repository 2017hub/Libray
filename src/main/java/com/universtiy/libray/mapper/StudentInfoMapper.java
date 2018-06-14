package com.universtiy.libray.mapper;


import com.universtiy.libray.domain.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentInfoMapper {
    int deleteByPrimaryKey(String stId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(String stId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}