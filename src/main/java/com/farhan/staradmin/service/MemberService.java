package com.farhan.staradmin.service;

import com.farhan.staradmin.mapper.MemberMapper;
import com.farhan.staradmin.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public ArrayList<Member> findMembers() {
        return this.memberMapper.find();
    }
}
