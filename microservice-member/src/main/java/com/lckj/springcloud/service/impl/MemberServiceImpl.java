package com.lckj.springcloud.service.impl;

import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import com.lckj.springcloud.mapper.MemberMapper;
import com.lckj.springcloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public MemberBase findById(Integer memberId) {
        return memberMapper.findById(memberId);
    }

    @Override
    public List<MemberBase> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public MemberBase findMember(MemberBaseDTO member) {
        MemberBase m = memberMapper.login(member);
        return m;
    }
}
