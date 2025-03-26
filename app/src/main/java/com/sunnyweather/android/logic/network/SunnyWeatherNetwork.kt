package com.sunnyweather.android.logic.network

import retrofit2.await
import retrofit2.http.Query

object SunnyWeatherNetwork {
    private val placeService = ServiceCreator.create<PlaceService>()

    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()


}