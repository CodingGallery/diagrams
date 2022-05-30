package com.coding.gallery.Service;

import com.coding.gallery.Entity.Member;
import com.coding.gallery.Repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl {
    @Autowired
    private MemberRepository memberRepository;

    // TODO : Spring Security를 이용하여 개발 예정

    public Member getMember(Member member)
    {
        return null;
    }
    
}
