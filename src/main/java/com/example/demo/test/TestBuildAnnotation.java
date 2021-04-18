package com.example.demo.test;

import com.example.demo.annotest.GetClassName;

public class TestBuildAnnotation {
    public static void main(String[] args) {

        Student student = new Student();
        Class tClass = student.getClass();
        GetClassName msg = (GetClassName) tClass.getAnnotation(GetClassName.class);
        System.out.println(msg.value());
        System.out.println("Hello world");
    }


}
