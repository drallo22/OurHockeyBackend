package com.example.ourhockey.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatisticRequest {

    @NotNull
    private Integer goals;
    @NotNull
    private Integer wins;
    @NotNull
    private Integer losses;
    @NotNull
    private Integer points;

    @NotNull
    private Integer gamesPlayed;
}
