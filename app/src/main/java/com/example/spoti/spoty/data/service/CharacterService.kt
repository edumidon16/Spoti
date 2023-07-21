package com.example.spoti.spoty.data.service

import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.model.CharactersListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharacterService @Inject constructor(
    private val api: ApiService
){
    suspend fun getCharacterList(): List<CharactersListResponse>{
        return withContext(Dispatchers.IO){
            val response = api.getCharacterList()
            response.body()?: emptyList()
        }
    }
// re
    suspend fun getCharacterInfo(id : Int): CharacterInfoResponse{
        return withContext(Dispatchers.IO){
            val response = api.getCharacterInfo(id)

            //SENSEI CORRIGEMELO!
            response.body()!!
        }
    }
}