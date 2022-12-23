package com.example.ourhockey.response;

import com.example.ourhockey.entity.Statistic;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatisticResponse {
    private int goals;
    private int wins;
    private int losses;
    private int points;
    private int gamesPlayed;

    public StatisticResponse(Statistic statistic){
        goals = statistic.getGoals();
        wins = statistic.getWins();
        losses = statistic.getLosses();
        points = statistic.getPoints();
        gamesPlayed = statistic.getGamesPlayed();
    }
}
