package com.placementgo.referral.dto;

import com.placementgo.referral.enums.TemplateType;
import lombok.Data;

@Data
public class RegenerateTemplateRequest {
    private TemplateType type;
}
