package com.coding.gallery;

import com.coding.gallery.Repository.MemberRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest
{
	@Autowired
	MemberRepository memberRepo;   
    
    @Test
    public void testClass(){
        System.out.println(memberRepo.getClass().getName());
    }
}
