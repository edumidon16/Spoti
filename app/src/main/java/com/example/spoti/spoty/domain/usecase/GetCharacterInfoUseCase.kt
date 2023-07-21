package com.example.spoti.spoty.domain.usecase

import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.repository.MyRepositoryImpl
import javax.inject.Inject

class GetCharacterInfoUseCase @Inject constructor(
    private val repository: MyRepositoryImpl
) {
    //suspend operator fun invoke(id: Int): CharacterInfoResponse = repository.getCharacterInfo(id)
}
