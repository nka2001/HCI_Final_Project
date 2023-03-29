package com.example.guphubAPIdemo.model;

import jakarta.persistence.*;




@Entity(name = "Student")
public class Student {
  
    @Id
    @Column(name = "StudentID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StudentID;


    @Column(name= "FName")
    private String FName;

    @Column(name= "LName")
    private String LName;
    @Column(name= "DOB")
    private String date;

    @Column(name= "UserName")
    private String UserName;
    @Column(name= "Password")
    private String Password;





    public Student(long studentID, String FName, String LName, String DOB, String user_name, String password) {
        StudentID = studentID;
        this.FName = FName;
        this.LName = LName;
        this.date = DOB;
        this.UserName = user_name;
        Password = password;
    }

    public Student() {
    }


    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(long studentID) {
        StudentID = studentID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
