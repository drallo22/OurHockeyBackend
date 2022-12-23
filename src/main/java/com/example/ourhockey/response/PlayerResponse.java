package com.example.ourhockey.response;


import com.example.ourhockey.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponse {
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public PlayerResponse(Player player){
        id = player.getId();
        firstName = player.getFirstName();
        lastName = player.getLastName();
        age = player.getAge();
    }
}
