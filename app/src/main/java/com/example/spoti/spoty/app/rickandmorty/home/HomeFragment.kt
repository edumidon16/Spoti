package com.example.spoti.spoty.app.rickandmorty.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
//import com.example.spoti.spoty.app.rickandmorty.viewmodel.CharacterListViewModel
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spoti.spoty.app.rickandmorty.adapter.CharacterAdapter
//import com.example.spoti.spoty.app.rickandmorty.viewmodel.CharacterInfoViewModel
import com.spotify.megaapp.R
import com.spotify.megaapp.databinding.FragmentMenuBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: CharacterAdapter

//    private val characterListModel : CharacterListViewModel by viewModels()
//    private val characterInfoModel : CharacterInfoViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        characterListModel.onCreate()
//
//        characterListModel.characterListModel.observe(this, Observer {
//
//        })
//
//        adapter = CharacterAdapter{characterId -> navigateToDetail(characterId)}
//        binding.rvRickAndMortyCharacters.setHasFixedSize(true)
//        binding.rvRickAndMortyCharacters.layoutManager = LinearLayoutManager(requireContext())
//        binding.rvRickAndMortyCharacters.adapter = adapter
//
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val username = arguments?.getString("username")
//
//    }
//
//    private fun navigateToDetail(id:Int){
//        findNavController().navigate(R.id.action_menuFragment_to_item2, bundleOf("id" to id))
    }

}
