package com.mengyuan.booksystem.entity;

import java.io.Serializable;

import java.util.Date;

/**
* 
* @TableName logs
*/
public class Logs implements Serializable {

    /**
    * 
    */
    private Integer id;
    /**
    * 
    */
    private Integer userId;
    /**
    * 
    */
    private String action;
    /**
    * 
    */
    private Date timestamp;
    /**
    * 
    */
    private Date createdAt;
    /**
    * 
    */
    private Date updatedAt;
    /**
    * 
    */
    private Integer isDeleted;

    /**
    * 
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 
    */
    private void setUserId(Integer userId){
    this.userId = userId;
    }

    /**
    * 
    */
    private void setAction(String action){
    this.action = action;
    }

    /**
    * 
    */
    private void setTimestamp(Date timestamp){
    this.timestamp = timestamp;
    }

    /**
    * 
    */
    private void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    /**
    * 
    */
    private void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    /**
    * 
    */
    private void setIsDeleted(Integer isDeleted){
    this.isDeleted = isDeleted;
    }


    /**
    * 
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 
    */
    private Integer getUserId(){
    return this.userId;
    }

    /**
    * 
    */
    private String getAction(){
    return this.action;
    }

    /**
    * 
    */
    private Date getTimestamp(){
    return this.timestamp;
    }

    /**
    * 
    */
    private Date getCreatedAt(){
    return this.createdAt;
    }

    /**
    * 
    */
    private Date getUpdatedAt(){
    return this.updatedAt;
    }

    /**
    * 
    */
    private Integer getIsDeleted(){
    return this.isDeleted;
    }

}
