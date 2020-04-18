package com.sovereign.matchmakingservice.model

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/*
int GameStateID, String boardOwnerUsername, String invaderUsername
 */

@Entity
data class Match (
        @Id
        @Column(name = "boardInvaderUsername", unique = true, nullable = false)
        @NotNull
        @Size(min = 3, max = 32)
        var boardInvaderUsername: String = "",

        @Column(name = "boardOwnerUsername", unique = true, nullable = false)
        @NotNull
        @Size(min = 3, max = 32)
        var boardOwnerUsername: String = "",

        var boardOwnerPresent: Boolean = true



)