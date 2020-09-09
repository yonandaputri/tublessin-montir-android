package com.example.tublessin_montir.domain.montir

import retrofit2.Call
import retrofit2.http.*

interface MontirAPI{

    @POST("/account/register/montir")
    fun registerMontir(@Body montirAccount: MontirAccount): Call<MontirResponeMessage>

    @GET("/montir/profile/detail/{id}")
    fun getMontirByID(@Path("id")id:String): Call<MontirResponeMessage>

    @GET("/montir/location/{id}")
    fun getMontirLocationByID(@Path("id")id:String): Call<MontirLocation>

    @POST("/montir/profile/update/location/{id}")
    fun updateMontirLocationByID(@Path("id")id:String, @Body montirLocation: MontirLocation): Call<MontirResponeMessage>

    @POST("/montir/profile/update/status/{id}")
    fun updateMontirStatusOperational(@Path("id")id:String, @Body montirStatus: MontirStatus): Call<MontirResponeMessage>

}
