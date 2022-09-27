package com.example.pokedex.responses

data class VersionGroupDetail(
    var level_learned_at: Int?,
    var move_learn_method: MoveLearnMethod?,
    var version_group: VersionGroup?
)