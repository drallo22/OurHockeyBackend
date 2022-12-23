package com.example.ourhockey.controller;

import com.example.ourhockey.entity.Player;
import com.example.ourhockey.entity.Team;
import com.example.ourhockey.request.PlayerRequest;
import com.example.ourhockey.request.TeamRequest;
import com.example.ourhockey.response.PlayerResponse;
import com.example.ourhockey.response.TeamResponse;
import com.example.ourhockey.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/teams")
public class TeamController {
    @Autowired
    TeamService teamService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{team_id}/players")
    public PlayerResponse addPlayer(
            @PathVariable long team_id,
            @Valid @RequestBody PlayerRequest playerRequest
            ){
        return new PlayerResponse(teamService.addPlayer(team_id, playerRequest));
    }

    @GetMapping("/{teamId}/players")
    public List<PlayerResponse> getAllPlayers(@PathVariable long teamId){
        List<Player> player = teamService.getAllPlayers(teamId);
        List<PlayerResponse> playerResponse = new ArrayList<>();
        for(int i = 0; i < player.size(); i++){
            playerResponse.add(new PlayerResponse(player.get(i)));
        }

        return playerResponse;
    }

    @DeleteMapping("/{teamId}/players")
    public void deleteAllPlayers(@PathVariable long teamId){
        teamService.deleteAllPlayers(teamId);
    }

    @GetMapping()
    public List<TeamResponse> getAllTeams(@RequestParam(required = false) String city){
        
        List<Team> teams = teamService.getAllTeams(city);
        List<TeamResponse> teamResponses = new ArrayList<>();
        teams.forEach(teacher -> {
            TeamResponse teamResponse = new TeamResponse(teacher);
            teamResponses.add(teamResponse);
        });
        return teamResponses;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public TeamResponse addTeam(@Valid @RequestBody TeamRequest teamRequest)
    {

            Team savedTeam = teamService.addTeam(teamRequest);

            return new TeamResponse(savedTeam);

    }

    @PutMapping("/{id}")
    public TeamResponse updateTeam
            (@PathVariable long id,
             @Valid @RequestBody TeamRequest teamRequest){

        Team updatedTeam = teamService.updateTeam(id, teamRequest);
        return new TeamResponse(updatedTeam);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable long id)
    {
        teamService.deleteTeam(id);
    }
}
