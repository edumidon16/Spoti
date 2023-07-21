package com.example.spoti.spoty.data.mapper

import com.example.spoti.spoty.data.model.CharacterInfoLocation
import com.example.spoti.spoty.data.model.CharacterInfoOrigin
import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.domain.model.CharacterInfo
import com.google.gson.annotations.SerializedName

fun CharacterResponseMapper (characterDetail: CharacterInfoResponse ): CharacterInfo {
    return CharacterInfo(
        //domain = data
        id = characterDetail.id,
        name = characterDetail.name,
        picture = characterDetail.characterImage,
        status = characterDetail.characterStatus,
        species = characterDetail.characterSpecies,
        gender = characterDetail.characterGender,
        origin = characterDetail.characterOriginName.name,
        location = characterDetail.characterLocationName.name

    )
}