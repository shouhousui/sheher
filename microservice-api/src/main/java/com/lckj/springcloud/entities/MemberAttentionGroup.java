package com.lckj.springcloud.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberAttentionGroup implements Serializable {

    private Integer Id;//主键
    private String LoginName;
    private String AttentionName;//用户关注者的姓名
    private Date AttentionDateTime;//关注时间
    private Date NoAttenttionTime;//取关时间
    private Integer IsBothAttention;//是否互粉
    private Integer Status;
}
