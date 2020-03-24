package com.lckj.springcloud.service;


import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-member", fallback = MemberServiceFallBack.class) //指定调用的微服务名称
@Service
public interface MemberService {

    @RequestMapping(value = "/member/find/{id}", method = RequestMethod.GET)
    MemberBase get(@PathVariable("id") Long id);

    @RequestMapping(value = "/member/list", method = RequestMethod.GET)
    List<MemberBase> list();

    @RequestMapping(value = "/member/login", method = RequestMethod.POST)
    MemberBase login(MemberBaseDTO member);

}
