package com.example.spoti.spoty.data.model


import com.google.gson.annotations.SerializedName

data class CharactersListResponse(
    @SerializedName("id") val characterId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species:String,
    @SerializedName("image") val characterImage:String,
    @SerializedName("gender") val characterGender:String
)