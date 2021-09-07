package com.trueddns.homenano.coffe

import com.google.gson.annotations.SerializedName

class Coffee (
   @SerializedName("id") val id: Int,
   @SerializedName("title") val title: String,
   @SerializedName("thumbnail") val thumbnail: String,
   @SerializedName("content") var content: String
 )