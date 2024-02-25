package com.example.movie2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SeriesListFragment : Fragment() {

    private lateinit var seriesAdapter: SeriesAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_series_list, container, false)
        recyclerView = view.findViewById(R.id.series_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        seriesAdapter = SeriesAdapter(DataProvider.seriesList)
        recyclerView.adapter = seriesAdapter
        return view
    }
}
