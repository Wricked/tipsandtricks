package com.tipsandtricks.main;

import com.tipsandtricks.*;

import java.io.*;
import java.lang.reflect.Method;

public class MyClass {

    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.println("myClass");
    }

    public static void main (String[] args) throws Exception {
        //Enum
        System.out.println("My Enum is: " + WhatIsEnum.GREEN);

        // Annotation
        Method method = MyClass.class.getMethod("sayHello");

        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("The value of MyAnnotation is " + annotation.value());

        StudentClass studentClass = new StudentClass("John", 25);
        studentClass.setX(annotation.value());

        String fileName = "F:\\Desenvolvimentos Pessoais\\Projects\\tipsandtricks\\Text.txt";
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        // Serialization
        try {
           fileOutputStream = new FileOutputStream(fileName);
           objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(studentClass);

           objectOutputStream.close();
           fileOutputStream.close();

            System.out.println("Object has been serialized: " + studentClass);
        } catch (IOException ioException) {
            System.out.println("IOException is caught");
            System.out.println(ioException.getMessage());
        }

        // Deserialization
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            StudentClass object = (StudentClass) objectInputStream.readObject();

            System.out.println("Object has been deserialized: " + object);
            System.out.println("The deserialized value of transient x is: " + object.getX());

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException ioException) {
            System.out.println("IOException is caught");
            System.out.println(ioException.getMessage());
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Student not found");
            System.out.println(classNotFoundException.getMessage());
        }

        //Threads
        // Threads in java can be either simple
        // (Extends from Thread) or custom class based Thread (Implements Runnable);
        int n = 10;
        MathUtils mathUtils = new MathUtils();
        //for (int i = 0; i < n; i++) {
            Thread1 t1 = new Thread1(mathUtils);
            Thread t2 = new Thread(new Thread2(mathUtils));

            t1.start();
            t2.start();
        //}

        int i = 10;

        //Autobox
        Integer integer = Integer.valueOf(i);
        System.out.println("Value of Integer integer: " + integer);
        Character character = 'a';
        System.out.println("Character: " + character);

        // It's possible to use valueof method to do that as well.

        //Auto unbox
        int i1 = integer;
        System.out.println("Value of int i1: " + i1);
        char ch = character;
        System.out.println("Char: " + ch);
    }
}
