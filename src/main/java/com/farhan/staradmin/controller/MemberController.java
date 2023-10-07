package com.farhan.staradmin.controller;

import com.farhan.staradmin.model.Member;
import com.farhan.staradmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = "members")
    public List<Member> findAll() {
        return memberService.findMembers();
    }
}
