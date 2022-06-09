package com.springboot.test.Controler;

import com.github.pagehelper.PageInfo;
import com.springboot.test.pojo.Student;
import com.springboot.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Controller
public class StudentControler {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/index")
    public String index(String name){
        return  "index";
    }

    //通过查询测试框架能不能运行
    @RequestMapping(value = "/getstudentmessage")
    public Student getstudent(int studentno){
        Student student  = studentService.findstudent(studentno);
        return  student;
    }

    //通过插入数据来测试事务处理
    @RequestMapping(value = "/getstudent")
    public int getstudent(int studentno,int loginPwd,int studentName){
        int i  = studentService.addstudent(studentno,loginPwd,studentName);
//        int i = 1/0;
        return  i;
    }

    //测试PageHelper分页+热部署
    @RequestMapping("/findStudentList")
    public PageInfo<Student> findUserList(int page, int size) {
        return studentService.findStudentList(page, size);
    }

    //测试热部署
    @RequestMapping("/myindex")
    public String index() {
        return "测试热部署1";
    }

}
