package com.lckj.springcloud.controller;

import com.lckj.springcloud.dto.MemberBaseDTO;
import com.lckj.springcloud.entities.MemberBase;
import com.lckj.springcloud.service.MemberService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MemberBaseController {

    @Autowired
    MemberService memberService;


    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/member/find/{id}", method = RequestMethod.GET)
    public MemberBase get(@PathVariable("id") Integer id) {
        MemberBase MemberBase = memberService.findById(id);
        //MemberBase,则模拟一个异常,
        if( null == MemberBase) {
            throw new RuntimeException("ID=" + id + "无效");
        }
        return MemberBase;
    }

    public MemberBase getFallback(@PathVariable("id") Integer id) {
        return new MemberBase();
    }

    @RequestMapping(value = "/member/list", method = RequestMethod.GET)
    public List<MemberBase> list() {
        return memberService.findAll();
    }

    @RequestMapping(value = "/member/login", method = RequestMethod.POST)
    public MemberBase login(@RequestBody MemberBaseDTO member){
        return memberService.findMember(member);
    }
}
