package com.mengyuan.booksystem.bo.entity;

import java.io.Serializable;
import java.util.Date;

/**
* 
* @TableName books
*/
public class Books implements Serializable {

    /**
    * 
    */
    private Integer id;
    /**
    * 
    */
    private String title;
    /**
    * 
    */
    private String author;
    /**
    * 
    */
    private Integer year;
    /**
    * 
    */
    private Integer addedBy;
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
    private void setTitle(String title){
    this.title = title;
    }

    /**
    * 
    */
    private void setAuthor(String author){
    this.author = author;
    }

    /**
    * 
    */
    private void setYear(Integer year){
    this.year = year;
    }

    /**
    * 
    */
    private void setAddedBy(Integer addedBy){
    this.addedBy = addedBy;
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
    private String getTitle(){
    return this.title;
    }

    /**
    * 
    */
    private String getAuthor(){
    return this.author;
    }

    /**
    * 
    */
    private Integer getYear(){
    return this.year;
    }

    /**
    * 
    */
    private Integer getAddedBy(){
    return this.addedBy;
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
