package com.mexbo.pojo;

import javax.persistence.*;

public class Users {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，已加密
     */
    private String password;

    /**
     * 用户头像
     */
    @Column(name = "face_image")
    private String faceImage;

    /**
     * 用户大头像
     */
    @Column(name = "face_image_big")
    private String faceImageBig;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户二维码
     */
    private String qrcode;

    /**
     * 用户客户端id
     */
    private String cid;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码，已加密
     *
     * @return password - 密码，已加密
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码，已加密
     *
     * @param password 密码，已加密
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户头像
     *
     * @return face_image - 用户头像
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * 设置用户头像
     *
     * @param faceImage 用户头像
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * 获取用户大头像
     *
     * @return face_image_big - 用户大头像
     */
    public String getFaceImageBig() {
        return faceImageBig;
    }

    /**
     * 设置用户大头像
     *
     * @param faceImageBig 用户大头像
     */
    public void setFaceImageBig(String faceImageBig) {
        this.faceImageBig = faceImageBig;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户二维码
     *
     * @return qrcode - 用户二维码
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * 设置用户二维码
     *
     * @param qrcode 用户二维码
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    /**
     * 获取用户客户端id
     *
     * @return cid - 用户客户端id
     */
    public String getCid() {
        return cid;
    }

    /**
     * 设置用户客户端id
     *
     * @param cid 用户客户端id
     */
    public void setCid(String cid) {
        this.cid = cid;
    }
}