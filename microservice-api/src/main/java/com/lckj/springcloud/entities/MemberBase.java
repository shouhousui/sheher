package com.lckj.springcloud.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class MemberBase implements Serializable {

    private Integer Id; //主键
    private String LoginName;//登录账号
    private String Password;//密码
    private String Mobile;//电话
    private String RegisterSource;//注册来源
    private short EnableUsed;//是否启用
    private Date CreateTime;//创建时间
    private Date LastLoginTime;//最后登录时间
    private Date LimitLoginTime;//下线时间
    private Integer AccountType;//账号类型
    private Integer Status;//状态
    private String Extend1;
    private String Extend2;
    private String Extend3;
    private String Extend4;
    private String Extend5;
}
