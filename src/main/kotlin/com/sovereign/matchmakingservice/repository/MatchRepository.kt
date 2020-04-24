package com.sovereign.matchmakingservice.repository

import com.sovereign.matchmakingservice.model.Match
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MatchRepository: JpaRepository<Match, String>{
    fun findByBoardOwnerUsername(boardOwnerUsername: String):Optional<Match>

}