package com.example.spoti.spoty.data.model

class CharacterProvider {
    companion object{
        var characterList: List<CharactersListResponse> = emptyList()

        lateinit var characterInfoResponse : CharacterInfoResponse
    }
}