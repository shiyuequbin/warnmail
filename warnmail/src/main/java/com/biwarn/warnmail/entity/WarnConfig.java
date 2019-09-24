package com.biwarn.warnmail.entity;

import lombok.Data;

@Data
public class WarnConfig {
    private String configId ;
    /**
     * 是否发送邮件
     */
    private String configName;
    // Y
    private String configValue;
}
