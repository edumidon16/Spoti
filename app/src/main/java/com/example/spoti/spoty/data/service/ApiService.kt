package com.example.spoti.spoty.data.service




import com.example.spoti.spoty.data.constants.Constants.Companion.API
import com.example.spoti.spoty.data.constants.Constants.Companion.CHARACTERS
import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.model.CharactersListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET(API + CHARACTERS)
    suspend fun getCharacterList(): Response<List<CharactersListResponse>>

    @GET("api/character/{id}")
    suspend fun getCharacterInfo(@Path("id") characterId: Int): Response<CharacterInfoResponse>

}