package com.universtiy.libray.service.impl;

import com.universtiy.libray.domain.StudentInfo;
import com.universtiy.libray.mapper.StudentInfoMapper;
import com.universtiy.libray.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Autowired
     StudentInfoMapper studentInfoMapper;

    @Override
    public StudentInfo selectByPrimaryKey(String stId) {

        return studentInfoMapper.selectByPrimaryKey(stId);
    }
}
