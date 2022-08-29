package com.gultendogan.currencyconverter.data
import com.gultendogan.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("access_key") apiKey: String = "YOUR_API_KEY"
    ): Response<CurrencyResponse>
}