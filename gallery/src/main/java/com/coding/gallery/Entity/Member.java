package com.coding.gallery.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member 
{
    @Id
    private String id;
    private String role;
    private String password;
    private String name;
    private String createDate;
    
    /* todo : encryption / decription 구현 */
    
}
