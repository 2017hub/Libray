package com.universtiy.libray.service;

import com.universtiy.libray.domain.StudentInfo;

public interface StudentInfoService {

    StudentInfo selectByPrimaryKey(String stId);
}
