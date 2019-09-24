package com.biwarn.warnmail.vo;

import com.biwarn.warnmail.entity.WarnRelation;
import lombok.Data;

import java.util.List;

@Data
public class WarnRelationVo extends WarnRelation {
    List<WarnRelationLevelVo> relationLevels;
}
