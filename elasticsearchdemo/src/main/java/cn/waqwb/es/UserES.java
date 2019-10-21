package cn.waqwb.es;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


/**
 * Created by qcl on 2018/7/10.
 * ES相关
 */
@Document(indexName = "user", type = "docs", shards = 1, replicas = 0)
public class UserES {

    //主键自增长
    @Id
    private Long id;//主键

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String userName;
    private String userPhone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserES{" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}