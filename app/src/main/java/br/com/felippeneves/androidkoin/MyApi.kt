package br.com.felippeneves.androidkoin

import retrofit2.http.GET

interface MyApi {

    @GET("my/endpoint")
    fun callApi();
}