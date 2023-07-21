package com.example.spoti.spoty.domain.repository

import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.model.CharactersListResponse

interface MyRepository {
    suspend fun getAllCharacters(): List<CharactersListResponse>

//    suspend fun getCharacterInfo(id: Int): CharacterInfoResponse
}