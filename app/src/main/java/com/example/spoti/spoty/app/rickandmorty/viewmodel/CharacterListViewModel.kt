package com.example.spoti.spoty.app.rickandmorty.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spoti.spoty.data.model.CharactersListResponse
import com.example.spoti.spoty.domain.usecase.GetCharacaterListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val getCharactersListResponse :GetCharacaterListUseCase
): ViewModel(){

    val characterListModel = MutableLiveData<CharactersListResponse>()

    fun onCreate(){
        viewModelScope.launch {
            val result = getCharactersListResponse()

            if(result.isNotEmpty()){
                characterListModel.postValue(result[0])
            }
        }
    }
}