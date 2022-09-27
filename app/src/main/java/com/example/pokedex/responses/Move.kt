package com.example.pokedex.responses

data class Move(
    var move: MoveX?,
    var version_group_details: List<VersionGroupDetail>?
)