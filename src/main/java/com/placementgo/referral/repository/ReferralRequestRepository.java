package com.placementgo.referral.repository;

import com.placementgo.referral.entity.ReferralRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReferralRequestRepository
        extends JpaRepository<ReferralRequest, UUID> {

    List<ReferralRequest> findByUserIdOrderByCreatedAtDesc(UUID userId);

    Optional<ReferralRequest> findByShareToken(String token);
}
