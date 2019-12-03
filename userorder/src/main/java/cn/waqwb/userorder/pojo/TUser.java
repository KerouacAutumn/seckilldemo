package cn.waqwb.userorder.pojo;

import java.io.Serializable;

public class TUser implements Serializable {
    private String userId;

    private Integer lev;

    private Integer points;

    private String userPassword;

    private String userName;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public TUser() {
    }

    public TUser(String userId, Integer lev, Integer points, String userPassword, String userName) {
        this.userId = userId;
        this.lev = lev;
        this.points = points;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userId='" + userId + '\'' +
                ", lev=" + lev +
                ", points=" + points +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}