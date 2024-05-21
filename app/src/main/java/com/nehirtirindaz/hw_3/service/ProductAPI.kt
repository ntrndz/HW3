package com.nehirtirindaz.hw_3.service

import com.nehirtirindaz.hw_3.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductAPI {

    @GET("products")
    fun getProducts(): Call<List<Product>>

}