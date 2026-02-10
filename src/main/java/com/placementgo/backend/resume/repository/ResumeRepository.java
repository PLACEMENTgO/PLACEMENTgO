package com.placementgo.backend.Resume.repository;
import com.placementgo.backend.Resume.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResumeRepository extends JpaRepository<Resume, UUID> {


}