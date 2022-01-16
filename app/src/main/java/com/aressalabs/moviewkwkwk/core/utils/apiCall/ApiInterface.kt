package com.aressalabs.moviewkwkwk.core.utils.apiCall

import com.aressalabs.moviewkwkwk.core.domain.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("3/movie/popular?api_key=5497119fe607a02621a85d7e0e376fcd&language=en-US")
    fun getPopularMovies(): Call<MovieResponse>
}