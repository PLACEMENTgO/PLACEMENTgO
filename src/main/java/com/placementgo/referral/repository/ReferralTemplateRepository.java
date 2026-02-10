package com.placementgo.referral.repository;

import com.placementgo.referral.entity.ReferralTemplate;
import com.placementgo.referral.enums.TemplateType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReferralTemplateRepository
        extends JpaRepository<ReferralTemplate, UUID> {

    List<ReferralTemplate> findByReferralRequestId(UUID referralId);

    long countByReferralRequestIdAndType(UUID referralId, TemplateType type);
}
