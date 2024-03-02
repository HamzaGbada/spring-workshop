package com.example.springworkshop.presentation;

import com.example.springworkshop.data.Member;
import com.example.springworkshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/create/member")
    public ResponseEntity<?> createMember(Member member) {

        return ResponseEntity.ok(memberService.createMember(member));
    }
    @GetMapping("/get/all/member")
    public ResponseEntity<?> getAllMembers() {
        return ResponseEntity.ok(memberService.getAllMembers());
    }

    @PutMapping("/updateMemberByEmail")
    public ResponseEntity<?> updateMemberByEmail(String email) {
        return ResponseEntity.ok(memberService.updateMemberByEmail(email));
    }

    public ResponseEntity<?> deleteMemberByEmail(String email) {
        return ResponseEntity.ok(memberService.deleteMemberByEmail(email));
    }
}
