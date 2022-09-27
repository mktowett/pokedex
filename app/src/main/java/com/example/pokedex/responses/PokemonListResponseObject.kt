package com.example.pokedex.responses

data class PokemonListResponseObject(
    var count: Int?,
    var next: String?,
    var previous: Any?,
    var results: List<Result?>?
)