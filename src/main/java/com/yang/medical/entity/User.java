package com.yang.medical.entity;

public class User {

    private Integer ID;
    private String Name;
    private String Password;
    private int type; //0代表病人，1代表医生
    public User() {
        super();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public int getType() {
        return type;
    }

    public User(Integer ID, String Name, String Password, int type) {
        super();
        this.ID = ID;
        this.Name = Name;
        this.Password = Password;
        this.type = type;
    }

}
