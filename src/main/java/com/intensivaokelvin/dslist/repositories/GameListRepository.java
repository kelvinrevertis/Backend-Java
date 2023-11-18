package com.intensivaokelvin.dslist.repositories;

import com.intensivaokelvin.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
