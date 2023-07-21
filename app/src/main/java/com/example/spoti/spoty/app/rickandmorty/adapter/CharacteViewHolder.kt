package com.example.spoti.spoty.app.rickandmorty.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.spoti.spoty.data.model.CharacterInfoResponse
import com.example.spoti.spoty.data.model.CharacterProvider.Companion.characterInfoResponse
import com.spotify.megaapp.databinding.ItemCharacterBinding
import com.squareup.picasso.Picasso

class RickAndMortyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemCharacterBinding.bind(view)

    fun bind(characterDataResponse: CharacterInfoResponse, onItemSelected: (Int) -> Unit){
        binding.tvCharacterName.text = characterInfoResponse.name
        binding.tvCharacterStatus.text = characterInfoResponse.characterStatus
        Picasso.get().load(characterDataResponse.characterImage).into(binding.iwCharacter)

        binding.root.setOnClickListener{onItemSelected(characterInfoResponse.id)}
    }
}