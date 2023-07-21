package com.example.spoti.spoty.data.repository

import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.model.CharacterProvider
import com.example.spoti.spoty.data.model.CharactersListResponse
import com.example.spoti.spoty.data.service.CharacterService
import com.example.spoti.spoty.domain.repository.MyRepository
import javax.inject.Inject

open class MyRepositoryImpl @Inject constructor(
    private val api : CharacterService
): MyRepository {

    override suspend fun getAllCharacters(): List<CharactersListResponse>{
        val response = api.getCharacterList()
        CharacterProvider.characterList = response
        return response
    }

//    override suspend fun getCharacterInfo(id: Int): CharacterInfoResponse{
//        val response = api.getCharacterInfo(id)
//        CharacterProvider.characterInfoResponse = response
//        return response
//
//    }

}