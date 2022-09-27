package com.example.pokedex.repository

import com.example.pokedex.remote.PokeApi
import com.example.pokedex.responses.PokemonListResponseObject
import com.example.pokedex.responses.PokemonResponseObject
import com.example.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor( private val api: PokeApi) {

    suspend fun getPokemonList(limit: Int, offest: Int): Resource<PokemonListResponseObject>{
        val response = try {
            api.getPokemonList(limit = limit, offset = offest)
        }catch (e: Exception){
            return Resource.Error("Something went wrong while processing your request. Please try again later")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemon(pokemonName: String): Resource<PokemonResponseObject>{
        val response = try {
            api.getPokemonInfo(name = pokemonName)
        }catch (e: Exception){
            return Resource.Error("Something went wrong while processing your request. Please try again later")
        }
        return Resource.Success(response)
    }
}