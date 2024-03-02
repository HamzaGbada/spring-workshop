package com.example.springworkshop.service;

import com.example.springworkshop.data.Member;

import java.util.List;

public interface MemberService {
    String createMember(Member member);
    List<Member> getAllMembers();
    String updateMemberByEmail(String email);
    String deleteMemberByEmail(String email);
}
