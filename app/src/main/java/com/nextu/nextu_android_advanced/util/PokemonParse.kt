package com.nextu.nextu_android_advanced.util

import androidx.compose.ui.graphics.Color
import com.nextu.nextu_android_advanced.data.remote.responses.Stat
import com.nextu.nextu_android_advanced.data.remote.responses.Type
import com.nextu.nextu_android_advanced.ui.theme.AtkColor
import com.nextu.nextu_android_advanced.ui.theme.DefColor
import com.nextu.nextu_android_advanced.ui.theme.HPColor
import com.nextu.nextu_android_advanced.ui.theme.SpAtkColor
import com.nextu.nextu_android_advanced.ui.theme.SpDefColor
import com.nextu.nextu_android_advanced.ui.theme.SpdColor
import com.nextu.nextu_android_advanced.ui.theme.TypeBug
import com.nextu.nextu_android_advanced.ui.theme.TypeDark
import com.nextu.nextu_android_advanced.ui.theme.TypeDragon
import com.nextu.nextu_android_advanced.ui.theme.TypeElectric
import com.nextu.nextu_android_advanced.ui.theme.TypeFairy
import com.nextu.nextu_android_advanced.ui.theme.TypeFighting
import com.nextu.nextu_android_advanced.ui.theme.TypeFire
import com.nextu.nextu_android_advanced.ui.theme.TypeFlying
import com.nextu.nextu_android_advanced.ui.theme.TypeGhost
import com.nextu.nextu_android_advanced.ui.theme.TypeGrass
import com.nextu.nextu_android_advanced.ui.theme.TypeGround
import com.nextu.nextu_android_advanced.ui.theme.TypeIce
import com.nextu.nextu_android_advanced.ui.theme.TypeNormal
import com.nextu.nextu_android_advanced.ui.theme.TypePoison
import com.nextu.nextu_android_advanced.ui.theme.TypePsychic
import com.nextu.nextu_android_advanced.ui.theme.TypeRock
import com.nextu.nextu_android_advanced.ui.theme.TypeSteel
import com.nextu.nextu_android_advanced.ui.theme.TypeWater
import java.util.*

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}