package com.lckj.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberPersonalinfo implements Serializable {

    private Integer  Id;
    private String  RealName;//真实姓名
    private char Sex;//性别1-男，2-女 0-未知
    private String  Birthday;//出生日期
    private String  UserPic;//用户头像（源图）路径
    private String  UserPicThumb;//用户头像（缩略图）路径
    private String  IdentityCode;//身份证号码
    private Integer Status;//状态（1-正常，0-删除）
    private String Extend1;//预留扩展字段
    private String Extend2;//预留扩展字段
    private String  Extend3;//预留扩展字段
    private String  Extend4;//预留扩展字段
    private String  Extend5;//预留扩展字段
}
