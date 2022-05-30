package com.coding.gallery.Repository;

import com.coding.gallery.Entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>
{
    // TODO : 구현예정
}
