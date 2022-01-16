package com.aressalabs.moviewkwkwk.core.feature.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.aressalabs.moviewkwkwk.R
import com.aressalabs.moviewkwkwk.core.domain.model.MovieModel
import com.aressalabs.moviewkwkwk.core.domain.model.MovieResponse
import com.aressalabs.moviewkwkwk.core.feature.home.`interface`.IMovieRecyclerListener
import com.aressalabs.moviewkwkwk.core.feature.home.adapter.MovieAdapter
import com.aressalabs.moviewkwkwk.core.feature.home.presenter.HomePresenter
import com.aressalabs.moviewkwkwk.core.utils.apiCall.ApiInterface
import com.aressalabs.moviewkwkwk.core.utils.apiCall.ApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), IMovieRecyclerListener {

    private lateinit var movieAdapter: MovieAdapter
    lateinit var presenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPopular.layoutManager = LinearLayoutManager(this)
        rvPopular.setHasFixedSize(true)
        presenter = HomePresenter()

        getPopularMovies { movies: List<MovieModel> ->
            movieAdapter = MovieAdapter(movies)
            movieAdapter.listener = this
            rvPopular.adapter = movieAdapter
        }

    }

    private fun getPopularMovies(callback: (List<MovieModel>) -> Unit){

        val apiService = ApiService.getInstance().create(ApiInterface::class.java)

        apiService.getPopularMovies().enqueue(object : Callback<MovieResponse>{

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                Log.d("response success ", response.body().toString())
                return callback(response.body()!!.results)
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

                Log.d("response error", t.toString())
            }

        })

    }

    override fun onItemClicked(view: View, movie: MovieModel) {

        Log.d("MOVIE ID",movie.id.toString())
        presenter.navigateToDetail(this, movie);
    }
}