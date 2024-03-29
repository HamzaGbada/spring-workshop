package com.example.springworkshop.service.ServiceImplementation;

import com.example.springworkshop.data.Member;
import com.example.springworkshop.data.repository.MemberRepo;
import com.example.springworkshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService {
    @Autowired
    private MemberRepo memberRepo;

    @Override
    public String createMember(Member member) {
        memberRepo.save(member);
        return "Member Created Success";
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepo.findAll();
    }

    @Override
    public String updateMemberByEmail(String email) {
        Member m = memberRepo.findByEmail(email);
        m.setCin(0000);
        memberRepo.save(m);
        return "member is updated";
    }

    @Override
    public String deleteMemberByEmail(String email) {
        memberRepo.deleteByEmail(email);
        return "member is deleted";
    }
}
