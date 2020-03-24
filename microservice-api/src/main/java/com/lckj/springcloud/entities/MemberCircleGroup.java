package com.lckj.springcloud.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberCircleGroup implements Serializable {

    private Integer Id;
    private Date LoginName;
    private Integer CircleId;
    private Integer Status;

}
