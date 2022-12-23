package com.example.ourhockey.controller;

import com.example.ourhockey.request.PlayerRequest;
import com.example.ourhockey.response.PlayerResponse;
import com.example.ourhockey.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @GetMapping("/{playerId}")
    public PlayerResponse getPlayer(@PathVariable long playerId) {
        return new PlayerResponse(playerService.getPlayers(playerId));
    }

    @PutMapping("/{playerId}")
    public PlayerResponse updatePlayer(@PathVariable long playerId, @Valid @RequestBody PlayerRequest playerRequest){
        return new PlayerResponse(playerService.updatePlayer(playerId, playerRequest));
    }

    @DeleteMapping("/{playerId}")
    public void deletePlayer(@PathVariable long playerId)
    {
        playerService.deletePlayer(playerId);
    }
}
