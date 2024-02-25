package com.example.movie2

data class Serie(
    val id: Int,
    val name: String,
    val publisher: String,
    val episodeCount: Int,
    val year: Int,
    val imageResourceId: Int
)
object DataProvider {
    val seriesList = listOf(
        Serie(1, "Agents of Shield", "Marvel", 136, 2013, R.drawable.agents_of_shield),
        Serie(2, "Arrow", "DC Comics", 170, 2012, R.drawable.arrow),
        // ... Ajoutez d'autres séries ici
    )
}