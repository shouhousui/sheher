package com.lckj.springcloud.service;

import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberServiceFallBack implements MemberService{


    @Override
    public MemberBase get(Long id) {
        return null;
    }

    @Override
    public List<MemberBase> list() {
        return null;
    }

    @Override
    public MemberBase login(MemberBaseDTO member) {
        return null;
    }


}
