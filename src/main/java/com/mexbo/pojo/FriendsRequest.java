package com.mexbo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "friends_request")
public class FriendsRequest {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 发送人id
     */
    @Column(name = "send_user_id")
    private String sendUserId;

    /**
     * 接收人id
     */
    @Column(name = "accept_user_id")
    private String acceptUserId;

    /**
     * 发送时间
     */
    @Column(name = "request_data_time")
    private Date requestDataTime;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取发送人id
     *
     * @return send_user_id - 发送人id
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置发送人id
     *
     * @param sendUserId 发送人id
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取接收人id
     *
     * @return accept_user_id - 接收人id
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * 设置接收人id
     *
     * @param acceptUserId 接收人id
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * 获取发送时间
     *
     * @return request_data_time - 发送时间
     */
    public Date getRequestDataTime() {
        return requestDataTime;
    }

    /**
     * 设置发送时间
     *
     * @param requestDataTime 发送时间
     */
    public void setRequestDataTime(Date requestDataTime) {
        this.requestDataTime = requestDataTime;
    }
}