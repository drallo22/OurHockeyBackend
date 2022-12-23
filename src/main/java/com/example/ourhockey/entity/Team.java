package com.example.ourhockey.entity;

import com.example.ourhockey.request.TeamRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="team")
@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="city", nullable = false)
    private String city;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="abbreviation", nullable = false)
    private String abbreviation;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Statistic statistic;

    public Team(TeamRequest teamRequest)
    {
        city = teamRequest.getCity();
        name = teamRequest.getName();
        abbreviation = teamRequest.getAbbreviation();

        statistic = new Statistic(teamRequest.getStatistic());
    }

}
