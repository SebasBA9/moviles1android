package com.sebastian.pdm123.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.sebastian.pdm123.navigation.BarItem

object NavBarItems {
    val  NavBarItems = listOf(
        BarItem(
            title = "Primer Parcial",
            image = Icons.Filled.ShoppingCart,
            route = "firstpartial"
        ),
        BarItem(
            title = "Segundo Parcial",
            image = Icons.Filled.Person,
            route = "secondpartial"
        ),
        BarItem(
            title = "Tercer Parcial",
            image = Icons.Filled.Star,
            route = "thirdpartial"
        )
    )
}