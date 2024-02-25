package com.example.movie2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SeriesAdapter(private val seriesList: List<Serie>) : RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>() {

    class SeriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.serie_image)
        val nameTextView: TextView = itemView.findViewById(R.id.serie_name)
        val publisherTextView: TextView = itemView.findViewById(R.id.serie_publisher)
        val episodesTextView: TextView = itemView.findViewById(R.id.serie_episodes)
        val yearTextView: TextView = itemView.findViewById(R.id.serie_year)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_serie, parent, false)
        return SeriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        val serie = seriesList[position]
        holder.nameTextView.text = serie.name
        holder.publisherTextView.text = serie.publisher
        holder.episodesTextView.text = "${serie.episodeCount} épisodes"
        holder.yearTextView.text = serie.year.toString()
        holder.imageView.setImageResource(serie.thumbnail)
    }

    override fun getItemCount(): Int = seriesList.size
}
