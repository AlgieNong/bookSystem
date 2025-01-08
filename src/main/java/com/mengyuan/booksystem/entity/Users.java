package com.mengyuan.booksystem.entity;


import java.io.Serializable;

import java.util.Date;

/**
* 
* @TableName users
*/
public class Users implements Serializable {

    /**
    * 
    */
    private Integer id;
    /**
    * 
    */
    private String username;
    /**
    * 
    */
    private String password;
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
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 
    */
    private void setPassword(String password){
    this.password = password;
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
    private String getUsername(){
    return this.username;
    }

    /**
    * 
    */
    private String getPassword(){
    return this.password;
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
