package com.example.ourhockey.repository;

import com.example.ourhockey.entity.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    public List<Team> findAllByCityIgnoreCase(String city);


}
