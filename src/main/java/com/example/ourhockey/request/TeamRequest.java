package com.example.ourhockey.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TeamRequest {

    @NotBlank
    private String city;
    @NotBlank
    private String name;
    @NotBlank
    private String abbreviation;

    @Valid
    @NotNull
    private StatisticRequest statistic;
}
