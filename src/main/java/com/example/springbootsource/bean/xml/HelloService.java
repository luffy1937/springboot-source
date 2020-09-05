package com.example.springbootsource.bean.xml;

public class HelloService {
    private Student student;

    public String hello(){
        return student.toString();
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
