package com.example.springworkshop.data.repository;

import com.example.springworkshop.data.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member, Long> {

    Member findByEmail(String email);
    void deleteByEmail(String email);
}
