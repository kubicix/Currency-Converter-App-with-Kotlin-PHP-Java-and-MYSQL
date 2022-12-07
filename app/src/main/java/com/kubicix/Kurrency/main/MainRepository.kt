package com.kubicix.Kurrency.main

import com.kubicix.Kurrency.data.models.CurrencyResponse
import com.kubicix.Kurrency.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}