package com.example.movie2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SeriesDetailFragment : Fragment() {

    // Vous pouvez utiliser un argument pour passer les détails de la série au fragment
    // Cet exemple ne contient pas la logique pour récupérer ces données.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate le layout pour ce fragment
        return inflater.inflate(R.layout.fragment_series_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ici, vous récupéreriez les détails de la série passés en argument et les afficheriez
        // à l'aide des vues définies dans votre layout fragment_series_detail.xml
    }
}
