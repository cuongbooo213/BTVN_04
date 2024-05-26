/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class SinhVien {
    private String id;
    private String name;
    private String gender;
    private String major;
    public SinhVien(){
        id = "He134124";
        name = "Truong Tran Cuong";
        gender = "nam";
        major = "SE";
    }

    public SinhVien(String id, String name, String gender, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", major=" + major + '}';
    }
    
    
    
}
