package com.gcendon.doglist

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogsByBreeds(@Url url: String): retrofit2.Response<DogsResponse>
}