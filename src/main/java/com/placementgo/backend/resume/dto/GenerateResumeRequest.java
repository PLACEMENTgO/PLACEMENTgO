package com.placementgo.backend.resume.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class JobDescription {
    UUID id;
    String description;
}
