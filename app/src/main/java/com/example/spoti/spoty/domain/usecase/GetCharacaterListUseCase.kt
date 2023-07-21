package com.example.spoti.spoty.domain.usecase

import com.example.spoti.spoty.data.model.CharactersListResponse
import com.example.spoti.spoty.data.repository.MyRepositoryImpl
import javax.inject.Inject

class GetCharacaterListUseCase @Inject constructor(
    private val repository: MyRepositoryImpl
){
    suspend operator fun invoke():List<CharactersListResponse> = repository.getAllCharacters()
}
