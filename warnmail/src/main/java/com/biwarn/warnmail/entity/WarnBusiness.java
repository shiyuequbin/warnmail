package com.biwarn.warnmail.entity;
import lombok.Data;

@Data
public class WarnBusiness {
    private String businessId;
    /**
     * 播放成功率 错误次数
     */
    private String businessName;
    private int sort;
}
