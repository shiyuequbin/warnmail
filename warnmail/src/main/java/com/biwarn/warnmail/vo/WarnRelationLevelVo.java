package com.biwarn.warnmail.vo;

import com.biwarn.warnmail.entity.WarnLevelJudge;
import lombok.Data;

import java.util.List;

@Data
public class WarnRelationLevelVo {
    private String relationLevelId;
    private String relationId;
    private String levelId;
    private int levelNo;
    private List<WarnLevelJudge> judges;
    private WarnLevelJudge judge;
}
