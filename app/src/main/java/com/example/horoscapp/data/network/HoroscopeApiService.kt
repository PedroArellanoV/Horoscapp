package com.example.horoscapp.data.network

import com.example.horoscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscopeDetails(@Path("sign") sing: String): PredictionResponse
}