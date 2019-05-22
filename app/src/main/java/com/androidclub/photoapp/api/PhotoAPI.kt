package com.androidclub.photoapp.api

import com.androidclub.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {

    @GET("?key=7824224-d5d17c575c203b65bb355e9da&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}