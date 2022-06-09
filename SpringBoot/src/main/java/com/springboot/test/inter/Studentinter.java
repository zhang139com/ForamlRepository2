package com.springboot.test.inter;


import com.springboot.test.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//此处的mapper注解已经被启动类上的mapperscanner代替
public interface Studentinter {
    //@Select是mybatis的注解
    @Select("SELECT * FROM student WHERE studentNo=#{studentNo}")
    Student findstudent(@Param("studentNo") int studentNo);

    @Select("SELECT * FROM student")
    List<Student> findstudentlist();

    @Insert("INSERT INTO student(studentNo,loginPwd,studentName) VALUES(#{studentNo},#{loginPwd},#{studentName})")
    int addstudent(@Param("studentNo") int studentNo,@Param("loginPwd") int loginPwd,
                   @Param("studentName") int studentName);

}
