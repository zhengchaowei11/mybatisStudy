package com.mexbo.pojo;

import javax.persistence.*;

@Table(name = "my_friends")
public class MyFriends {
    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 当前用户id
     */
    @Column(name = "my_user_id")
    private String myUserId;

    /**
     * 添加朋友的id
     */
    @Column(name = "my_friend_user_id")
    private String myFriendUserId;

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
     * 获取当前用户id
     *
     * @return my_user_id - 当前用户id
     */
    public String getMyUserId() {
        return myUserId;
    }

    /**
     * 设置当前用户id
     *
     * @param myUserId 当前用户id
     */
    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId;
    }

    /**
     * 获取添加朋友的id
     *
     * @return my_friend_user_id - 添加朋友的id
     */
    public String getMyFriendUserId() {
        return myFriendUserId;
    }

    /**
     * 设置添加朋友的id
     *
     * @param myFriendUserId 添加朋友的id
     */
    public void setMyFriendUserId(String myFriendUserId) {
        this.myFriendUserId = myFriendUserId;
    }
}