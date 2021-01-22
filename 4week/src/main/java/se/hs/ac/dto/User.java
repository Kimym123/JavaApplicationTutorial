package se.hs.ac.dto;

public class User {
    private String userName;
    private String userPhone;
    private String userCompany;

    public User() {

    }

    public User(String userName, String userPhone, String userCompany) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCompany = userCompany;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "Name='" + userName + '\'' +
                ", Phone='" + userPhone + '\'' +
                ", Company='" + userCompany + '\'' +
                '}';
    }
}
