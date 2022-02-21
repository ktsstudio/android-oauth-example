package com.kts.github.utils

import androidx.annotation.NavigationRes
import androidx.navigation.NavController

fun NavController.resetNavGraph(@NavigationRes navGraph: Int) {
    val newGraph = navInflater.inflate(navGraph)
    graph = newGraph
}