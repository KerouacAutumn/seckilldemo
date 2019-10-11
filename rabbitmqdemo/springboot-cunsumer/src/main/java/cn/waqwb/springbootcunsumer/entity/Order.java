package cn.waqwb.springbootcunsumer.entity;

import java.io.Serializable;

/**
 * @author JokerQ
 * @date 2019/7/31 - 14:58
 */
public class Order implements Serializable {


    private static final long serialVersionUID = -5505206038172196898L;
    private String id;
    private String name;
    private String messageId;//存储消息发送的唯一标识

    public Order() {
    }

    public Order(String id, String name, String messageId) {
        this.id = id;
        this.name = name;
        this.messageId = messageId;
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

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
