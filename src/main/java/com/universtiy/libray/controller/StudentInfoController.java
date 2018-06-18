package com.universtiy.libray.controller;

import com.universtiy.libray.domain.StudentInfo;
import com.universtiy.libray.service.StudentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin//解决跨域的问题
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
        return studentInfo1.getStId();
    }

    /**
     * 增加一个学生信息
     */

    @RequestMapping("/addStuInfo")
    public void addStudentInfo(StudentInfo studentInfo){
        int row=0;
        try {
           row=  studentInfoService.insertSelective(studentInfo);
        }catch (Exception e){
            e.printStackTrace();
        }

      if(row>0){
          logger.info("---------->学生信息添加成功！");
      }else{
          logger.info("---------->学生信息添加失败！");
      }
    }
}
