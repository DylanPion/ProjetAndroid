package com.nextu.nextu_android_advanced

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nextu.nextu_android_advanced.pokemondetail.PokemonDetailScreen
import com.nextu.nextu_android_advanced.pokemonlist.PokemonListScreen
import com.nextu.nextu_android_advanced.ui.theme.ComposePokedexTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePokedexTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "pokemon_list_screen") {
                    composable("pokemon_list_screen") {
                        PokemonListScreen(navController = navController)
                    }
                    composable(
                        "pokemon_detail_screen/{dominantColor}/{pokemonName}",
                        arguments = listOf(
                            navArgument("dominantColor") { // Fixing route and navArgument
                                type = NavType.IntType
                            },
                            navArgument("pokemonName") { // Fixing route and navArgument
                                type = NavType.StringType
                            }
                        )
                    ) { backStackEntry ->
                        val dominantColor = remember {
                            val color = backStackEntry.arguments?.getInt("dominantColor")
                            color?.let { Color(it) } ?: Color.White
                        }
                        val pokemonName = remember {
                            backStackEntry.arguments?.getString("pokemonName")
                        }
                        PokemonDetailScreen(
                            dominantColor = dominantColor,
                            pokemonName = pokemonName ?.toLowerCase(Locale.ROOT)?:"",
                            navController = navController)
                    }
                }
            }
        }
    }
}
