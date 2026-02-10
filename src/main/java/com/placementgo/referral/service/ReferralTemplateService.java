package com.placementgo.referral.service;

import com.placementgo.referral.dto.ReferralTemplateResponse;
import com.placementgo.referral.repository.ReferralTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReferralTemplateService {

    private final ReferralTemplateRepository repo;

    public List<ReferralTemplateResponse> getTemplates(UUID referralId) {
        return repo.findByReferralRequestId(referralId)
                .stream()
                .map(t -> ReferralTemplateResponse.builder()
                        .type(t.getType().name())
                        .message(t.getMessage())
                        .version(t.getVersion())
                        .build())
                .toList();
    }
}
