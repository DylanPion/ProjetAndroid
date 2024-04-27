package com.nextu.nextu_android_advanced.repository

import com.nextu.nextu_android_advanced.data.remote.PokeApi
import com.nextu.nextu_android_advanced.data.remote.responses.Pokemon
import com.nextu.nextu_android_advanced.data.remote.responses.PokemonList
import com.nextu.nextu_android_advanced.util.Ressource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor (
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int) : Ressource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
                return Ressource.Error("An unknown error occured")
        }
        return Ressource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String) : Ressource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Ressource.Error("An unknown error occured")
        }
        return Ressource.Success(response)
    }
}