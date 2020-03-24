package com.lckj.springcloud.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberExtendinfo implements Serializable {

    private Integer Id;
    private String LoginName;//登陆名
    private Integer AttentionCount;//用户关注的人数
    private Integer BeAttentionedCount;//被关注
    private Integer FriendCount;//好友人数
    private Integer  ReleaseCount;//用户发布数
    private Integer  ShareCount; //用户分享数
    private Integer  PraiseCount;//用户点赞数
    private Integer  BePraiseCount;//用户获赞数
    private Integer  ReviewCount; //用户回复数
    private Integer  Status;//状态（1-正常，0-删除
    private String  Extend1;//预留扩展字段
    private String  Extend2;//预留扩展字段
    private String  Extend3;//预留扩展字段
    private String  Extend4;//预留扩展字段
    private String  Extend5;//预留扩展字段
}
