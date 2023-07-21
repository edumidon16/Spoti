package com.example.spoti.spoty.app.rickandmorty.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.domain.usecase.GetCharacterInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterInfoViewModel @Inject constructor(
    private val getCharacterInfoResponse: GetCharacterInfoUseCase
): ViewModel(){
    val characterInfoModel = MutableLiveData<CharacterInfoResponse>()

    fun onCreate(id: Int){
        viewModelScope.launch {
            val result = getCharacterInfoResponse(id)
        }

    }

}