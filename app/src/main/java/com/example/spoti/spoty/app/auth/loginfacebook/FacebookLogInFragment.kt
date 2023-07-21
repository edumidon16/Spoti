package com.example.spoti.spoty.app.auth.loginfacebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.spotify.megaapp.R
import com.spotify.megaapp.databinding.FragmentFacebookLogInBinding


class FacebookLogInFragment : Fragment() {
    private var _binding: FragmentFacebookLogInBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View {
        _binding = FragmentFacebookLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogInFacebook.setOnClickListener{
            if(binding.etPasswordFacebook.text.isNotBlank() && binding.etUsernameFacebook.text.isNotBlank()){
                val bundle = Bundle().apply {
                    putString("username", binding.etUsernameFacebook.text.toString())
                }
                findNavController().navigate(R.id.action_facebookLogInFragment_to_menuFragment)
            }
        }

    }

}