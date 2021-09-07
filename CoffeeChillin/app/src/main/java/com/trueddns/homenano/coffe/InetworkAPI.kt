package com.trueddns.homenano.coffe

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET


interface InetworkAPI {
    @GET("coffee.json")

    fun getAllData(): Observable<List<Coffee>>

}