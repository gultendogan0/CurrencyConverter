package com.gultendogan.currencyconverter.main

import com.gultendogan.currencyconverter.data.models.CurrencyResponse
import com.gultendogan.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(): Resource<CurrencyResponse>
}