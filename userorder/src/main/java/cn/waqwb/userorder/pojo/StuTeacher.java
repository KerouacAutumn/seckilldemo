package cn.waqwb.userorder.pojo;

import java.io.Serializable;

public class StuTeacher implements Serializable {
    private Integer sid;

    private Integer tid;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}