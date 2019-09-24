package com.biwarn.warnmail.entity;

import lombok.Data;

@Data
public class WarnLevelJudge {
    private String judgeId;
    private String relationLevelId;
    // <
    private String conditionOperator;
    // 0.99
    private double conditionValue;
    // 2次
    private int validCount;

}
