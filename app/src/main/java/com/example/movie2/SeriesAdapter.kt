package com.example.movie2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SeriesAdapter(private val seriesList: List<Serie>) : RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>() {

    // ViewHolder classe interne pour gérer les références aux composants de la vue
    class SeriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val publisherTextView: TextView = itemView.findViewById(R.id.publisher_text_view)
        val episodesTextView: TextView = itemView.findViewById(R.id.episodes_text_view)
        val yearTextView: TextView = itemView.findViewById(R.id.year_text_view)
        // Ajoutez d'autres références de vues si nécessaire
    }

    // Crée un nouveau ViewHolder pour l'élément de la liste
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_serie, parent, false)
        return SeriesViewHolder(view)
    }

    // Remplit les données dans les vues de l'élément de la liste
    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        val serie = seriesList[position]
        holder.nameTextView.text = serie.name
        holder.publisherTextView.text = serie.publisher
        holder.episodesTextView.text = "${serie.episodeCount} épisodes"
        holder.yearTextView.text = serie.year.toString()
        // Assurez-vous d'avoir une image correspondante dans vos ressources drawable
        holder.imageView.setImageResource(serie.imageResourceId)
    }

    // Retourne la taille de la liste des données
    override fun getItemCount() = seriesList.size
}