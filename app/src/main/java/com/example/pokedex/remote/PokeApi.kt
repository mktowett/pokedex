package com.example.pokedex.remote

import com.example.pokedex.responses.PokemonListResponseObject
import com.example.pokedex.responses.PokemonResponseObject
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit : Int,
        @Query("offset") offset: Int
    ): PokemonListResponseObject

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): PokemonResponseObject
}