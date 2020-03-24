package com.lckj.springcloud.controller;


import com.lckj.springcloud.common.BaseResponse;
import com.lckj.springcloud.common.StatusCode;
import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import com.lckj.springcloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;


    @RequestMapping(value = "/consumer/memberBase/get/{id}")
    public MemberBase get(@PathVariable("id") Long id) {
        return memberService.get(id);
    }

    @RequestMapping(value = "/consumer/memberBase/list")
    public List<MemberBase> list() {
        return memberService.list();
    }

    @RequestMapping(value = "/consumer/memberBase/login", method = RequestMethod.POST)
    public BaseResponse<MemberBase> login(MemberBaseDTO member) {
        BaseResponse  response = new BaseResponse();
        MemberBase membervo = memberService.login(member);
        if(null == membervo) {
            response.setMsg(StatusCode.NOTFUND.getMsg());
            response.setCode(StatusCode.NOTFUND.getCode());
            response.setData(null);

        }
        response.setMsg(StatusCode.SUCCESS.getMsg());
        response.setCode(StatusCode.SUCCESS.getCode());
        response.setData(membervo);
        return response;
    }
}
