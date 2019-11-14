package com.sushant.esoftwarica.model;

import java.util.ArrayList;
import java.util.List;

public class User{
    private int imageid;
    private String name,address, age, gender;

    static List<User> userList=new ArrayList<>();

    public User(String name, String address, String age, String gender) {
        this.imageid = imageid;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        User.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}