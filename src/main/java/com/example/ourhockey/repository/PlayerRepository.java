package com.example.ourhockey.repository;

import com.example.ourhockey.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    public List<Player> findAllByTeamId(long team_id);
    @Transactional
    void deleteAllByTeamId(long teamId);
}
