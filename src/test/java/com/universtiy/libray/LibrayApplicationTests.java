package com.universtiy.libray;

import com.universtiy.libray.domain.StudentInfo;
import com.universtiy.libray.service.StudentInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LibrayApplicationTests {
    final Logger logger=LoggerFactory.getLogger(this.getClass());
    @Autowired
    StudentInfoService studentInfoService;
    @Test
    public void contextLoads() {
        logger.debug("------->debug");
    }

    /**
     * 测试增加学生信息
     */
    @Test
    public void addStuInfo(){
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setStId("128001");
        studentInfo.setStNo("09080739");
        studentInfo.setStName("wapm1");
        studentInfo.setGrend("1");
        studentInfo.setGrade("计算机");

        int row=0;
          try {
             row=studentInfoService.insertSelective(studentInfo);

          }catch (Exception e){
              e.printStackTrace();
          }

        if(row>0){
            logger.info("------>学生信息添加成功！");
        }else{
            logger.info("------->学生信息添加失败！");
        }

    }
}
