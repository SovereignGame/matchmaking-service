package com.sovereign.matchmakingservice.controller

import com.sovereign.matchmakingservice.Service.MatchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/matchmakingService")
class MatchController(private val matchService: MatchService) {

    @PostMapping("/matchWith/{username}/")
    fun postMatchAgainstUser(@RequestHeader("Username") username:String, @PathVariable opponent: String) {

/*
        Respons: Den informasjonen som trengs for å koble seg opp mot den aktuelle økten hos GameInstanceService.
        “.matchmaking/${username}”
        Det må være funksjonalitet slik at når bruker går ut av applikasjonen, så ender økten, og den økten fjernes fra MatchmakingDB. Om det er to spillere på brettet, fjernes bare den som går ut av applikasjonen.
*/
    }
    @DeleteMapping("/{username}")
    fun deleteMatch(@PathVariable("username") username:String){


    }
}
/*
“.matchmaking/${username}”
Det må være funksjonalitet slik at når bruker går ut av applikasjonen, så ender økten, og den økten fjernes fra MatchmakingDB. Om det er to spillere på brettet, fjernes bare den som går ut av applikasjonen.

Delete: { }
Respons: ?

 */