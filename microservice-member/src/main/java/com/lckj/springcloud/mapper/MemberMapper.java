package com.lckj.springcloud.mapper;

import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import java.util.List;


public interface MemberMapper {

    MemberBase findById(Integer memberId);

    List<MemberBase> findAll();

    /**
     * 表改过后加入tokenj校验
     * @param member
     * @return
     */
    MemberBase login(MemberBaseDTO member);
}
