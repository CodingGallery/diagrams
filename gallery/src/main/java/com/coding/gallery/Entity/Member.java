package com.coding.gallery.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "MEMBER_INFO")
public class Member 
{
    @Id
    private String id;
    private String role;
    private String password;
    private String name;
    private Date createDate;

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    @Override
    public String toString()
    {
        return "Member [id = " + id + ", role = " + role + ", password = " + password + ", name = " + name + ", createDate = " + createDate + "]";
    }
    
    /* todo : encryption / decription 구현 */
    
}
