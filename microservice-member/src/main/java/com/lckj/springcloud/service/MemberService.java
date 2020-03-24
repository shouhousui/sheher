package com.lckj.springcloud.service;

import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;

import java.util.List;

public interface MemberService {

    MemberBase findById(Integer memberId);

    List<MemberBase> findAll();

    MemberBase findMember(MemberBaseDTO member);


}
