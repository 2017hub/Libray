package com.universtiy.libray.controller;

import com.universtiy.libray.domain.StudentInfo;
import com.universtiy.libray.service.StudentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentInfoController {

    @Autowired
    StudentInfoService studentInfoService;

    final Logger logger=LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/stuInfo")
    @ResponseBody
    public String getStudentInfo(String id){
        logger.info("----------->studentInfoController"+id);
        //System.out.println("-----s----->"+id);

        StudentInfo studentInfo1 =studentInfoService.selectByPrimaryKey(id);
        System.out.println("-----s----->"+studentInfo1.getStName());
        return "StudentInfoController";
    }
}
