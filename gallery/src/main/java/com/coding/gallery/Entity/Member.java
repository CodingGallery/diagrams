package com.coding.gallery.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "MEMBER_INFO")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member 
{
    @Id
    @Column(length = 100, nullable = false)
    private String id;

    @Column(length = 20, nullable = false)
    private String role;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
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
