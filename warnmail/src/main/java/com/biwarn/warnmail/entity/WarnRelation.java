package com.biwarn.warnmail.entity;

import lombok.Data;

@Data
public class WarnRelation {
    private String relationId;
    private String productId;
    private String osId;
    private String businessId;
    private String isProvince = "N";
    // 是否生效
    private String isVerify = "N";
    private double threshold;
    private int thresholdCount;
}
