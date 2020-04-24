package com.sovereign.matchmakingservice.Service

import com.sovereign.matchmakingservice.model.Match
import com.sovereign.matchmakingservice.repository.MatchRepository
import org.springframework.stereotype.Service

@Service
class MatchService(private val matchRepository: MatchRepository){

    fun createNewMatch(boardInvaderUsername:String ,boardOwnerUsername:String):Boolean{
        if(userActiveInvading(boardInvaderUsername)) return false
        if(userAlreadyBeeingInvaded(boardOwnerUsername)) return false
        matchRepository.save(Match(boardInvaderUsername,boardOwnerUsername,userActiveInvading(boardOwnerUsername)))
        return true
    }

    fun userActiveInvading(username:String):Boolean{
        return matchRepository.findById(username).isPresent
    }

    fun userAlreadyBeeingInvaded(username:String):Boolean{
        return matchRepository.findByBoardOwnerUsername(username).isPresent
    }

}