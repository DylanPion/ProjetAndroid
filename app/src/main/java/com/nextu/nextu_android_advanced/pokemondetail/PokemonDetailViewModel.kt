package com.nextu.nextu_android_advanced.pokemondetail

import androidx.lifecycle.ViewModel
import com.nextu.nextu_android_advanced.data.remote.responses.Pokemon
import com.nextu.nextu_android_advanced.repository.PokemonRepository
import com.nextu.nextu_android_advanced.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}