package com.gi.springboot01.domain;

import java.util.Objects;

public class User {
    private String userName;
    private String userId;
    private String userPhone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public User() {
    }

    public User(String userName, String userId, String userPhone) {
        this.userName = userName;
        this.userId = userId;
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(userId, user.userId) &&
                Objects.equals(userPhone, user.userPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userId, userPhone);
    }
}
