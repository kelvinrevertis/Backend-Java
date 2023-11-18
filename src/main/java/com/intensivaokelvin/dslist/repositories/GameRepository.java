package com.intensivaokelvin.dslist.repositories;

import com.intensivaokelvin.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
