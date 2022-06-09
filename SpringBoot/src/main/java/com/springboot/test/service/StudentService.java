package com.springboot.test.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.test.inter.Studentinter;
import com.springboot.test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private Studentinter studentinter;

    public  Student findstudent(int studentno){
        Student student = studentinter.findstudent(studentno);
        return student;
    }
    @Transactional
    public  Integer addstudent(int studentno,int loginPwd,int studentName){
        int result = studentinter.addstudent(studentno,loginPwd,studentName);
        int i = 2/0;
        return result;
    }

    /*
    ** page为第几页，size为每页显示多少条数据
     */
    public PageInfo<Student> findStudentList(int page, int size) {
        // 开启分页插件,放在查询语句上面
        PageHelper.startPage(page, size);
        List<Student> listStudent = studentinter.findstudentlist();
        // 封装分页之后的数据
        PageInfo<Student> pageInfoStudent = new PageInfo<Student>(listStudent);
        return pageInfoStudent;
    }

}
