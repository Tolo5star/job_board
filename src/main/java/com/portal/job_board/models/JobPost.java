package com.portal.job_board.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobPost {

    private String jobTitle;
    private String location;
    private String company;
    private List<String> keySkills;
    private String description;
}