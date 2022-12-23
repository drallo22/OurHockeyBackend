package com.example.ourhockey.entity;

import com.example.ourhockey.request.StatisticRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "statistics")
public class Statistic {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private int goals;
    @Column(nullable = false)
    private int wins;
    @Column(nullable = false)
    private int losses;
    @Column(nullable = false)
    private int points;
    @Column(name="games_played", nullable = false)
    private int gamesPlayed;

    public Statistic(StatisticRequest statisticRequest)
    {
        goals = statisticRequest.getGoals();
        wins = statisticRequest.getWins();
        losses = statisticRequest.getLosses();
        points = statisticRequest.getPoints();
        gamesPlayed = statisticRequest.getGamesPlayed();
    }
}
