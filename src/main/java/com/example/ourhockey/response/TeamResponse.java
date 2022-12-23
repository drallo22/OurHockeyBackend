package com.example.ourhockey.response;

import com.example.ourhockey.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamResponse {
    private long id;
    private String city;
    //private String lastName;
    private String name;

    private String abbreviation;

    private StatisticResponse statistic;
    public TeamResponse(Team team){
        id = team.getId();
        city = team.getCity();
        name = team.getName();
        abbreviation = team.getAbbreviation();
        statistic = new StatisticResponse(team.getStatistic());
    }
}
