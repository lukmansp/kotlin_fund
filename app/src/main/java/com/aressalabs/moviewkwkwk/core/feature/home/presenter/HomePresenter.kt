package com.aressalabs.moviewkwkwk.core.feature.home.presenter

import android.content.Context
import com.aressalabs.moviewkwkwk.core.domain.model.MovieModel
import com.aressalabs.moviewkwkwk.core.feature.home.router.HomeRouter


class HomePresenter {

    private val router: HomeRouter = HomeRouter()

    fun navigateToDetail(context: Context, movie: MovieModel) {

        router.navigateToDetail(context, movie)

    }

}