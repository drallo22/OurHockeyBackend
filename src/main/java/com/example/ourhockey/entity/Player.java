package com.example.ourhockey.entity;

import com.example.ourhockey.request.PlayerRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private int age;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="team_id")
    private Team team;

    public Player(PlayerRequest playerRequest){
        firstName = playerRequest.getFirstName();
        lastName = playerRequest.getLastName();
        age = playerRequest.getAge();
    }

}
