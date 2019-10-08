package com.mexbo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "chat_msg")
public class ChatMsg {
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
     * 消息内容
     */
    private String msg;

    /**
     * 是否已读
     */
    @Column(name = "sign_flag")
    private Boolean signFlag;

    /**
     * 消息创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取消息内容
     *
     * @return msg - 消息内容
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置消息内容
     *
     * @param msg 消息内容
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取是否已读
     *
     * @return sign_flag - 是否已读
     */
    public Boolean getSignFlag() {
        return signFlag;
    }

    /**
     * 设置是否已读
     *
     * @param signFlag 是否已读
     */
    public void setSignFlag(Boolean signFlag) {
        this.signFlag = signFlag;
    }

    /**
     * 获取消息创建时间
     *
     * @return create_time - 消息创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置消息创建时间
     *
     * @param createTime 消息创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}