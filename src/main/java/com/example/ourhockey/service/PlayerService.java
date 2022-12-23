package com.example.ourhockey.service;

import com.example.ourhockey.entity.Player;
import com.example.ourhockey.exception.ResourceNotFoundException;
import com.example.ourhockey.repository.PlayerRepository;
import com.example.ourhockey.request.PlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player getPlayers(long playerId)
    {
        Player player = playerRepository.findById(playerId).orElseThrow(()->new ResourceNotFoundException("player id not found"));
        return player;
    }

    public Player updatePlayer(long playerId, PlayerRequest playerRequest){
        if(playerRepository.existsById(playerId))
        {
            Player playerToBeUpdated = new Player(playerRequest);
            playerToBeUpdated.setId(playerId);
            return playerRepository.save(playerToBeUpdated);
        }
        else{
            throw new ResourceNotFoundException("player id not found");
        }
    }

    public void deletePlayer(long playerId){
        if(playerRepository.existsById(playerId)){
            playerRepository.deleteById(playerId);
        }
        else{
            throw new ResourceNotFoundException("player id not found");

        }
    }
}
