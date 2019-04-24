package com.wuxy.entity;

import java.util.List;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-22 17:34
 **/
public class Student {
    private int id;
    private String name;
    private String password;
    private Integer age;
    private String gender;
    private Address address;
    private boolean flag;
    private String[] hobby;
    private List<String> hobbys;
    private List<String> selectHobby;
    private int rodioId;
    private Map<Integer, String> gradeMap;
    private int selectGrade;
    private Map<Integer, String> cityMap;
    private int selectCity;
    private String introduce;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public List<String> getSelectHobby() {
        return selectHobby;
    }

    public void setSelectHobby(List<String> selectHobby) {
        this.selectHobby = selectHobby;
    }

    public int getRodioId() {
        return rodioId;
    }

    public void setRodioId(int rodioId) {
        this.rodioId = rodioId;
    }

    public Map<Integer, String> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<Integer, String> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public int getSelectGrade() {
        return selectGrade;
    }

    public void setSelectGrade(int selectGrade) {
        this.selectGrade = selectGrade;
    }

    public Map<Integer, String> getCityMap() {
        return cityMap;
    }

    public void setCityMap(Map<Integer, String> cityMap) {
        this.cityMap = cityMap;
    }

    public int getSelectCity() {
        return selectCity;
    }

    public void setSelectCity(int selectCity) {
        this.selectCity = selectCity;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
