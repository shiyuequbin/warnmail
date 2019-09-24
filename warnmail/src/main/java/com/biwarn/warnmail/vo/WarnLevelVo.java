package com.biwarn.warnmail.vo;

import com.biwarn.warnmail.entity.WarnLevel;
import com.biwarn.warnmail.entity.WarnLevelJudge;
import lombok.Data;

import java.util.List;

@Data
public class WarnLevelVo extends WarnLevel {
    private String relationLevelId;
    private String checkedLevelId;
    private List<WarnLevelJudge> judges;
}
