package com.example.spoti.spoty.app.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.spotify.megaapp.R
import com.spotify.megaapp.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
   private var _binding: FragmentSignUpBinding?= null
   private val binding get() = _binding!!

   override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       saveInstanceState: Bundle?
   ): View {
       _binding = FragmentSignUpBinding.inflate(inflater, container, false)
       return binding.root
   }

   override fun onDestroyView(){
       super.onDestroyView()
       _binding = null
   }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignUp.setOnClickListener{
            if(binding.etPassword == binding.etPassword2 && binding.etPassword.text.isNotBlank() && binding.etUsername.text.isNotBlank()){

                var bundle = Bundle().apply {
                    putString("username", binding.etUsername.text.toString())
                }
                findNavController().navigate(R.id.action_signUpFragment_to_menuFragment, bundle)

            }else{
                Toast.makeText(requireContext(), "Write the same password!", Toast.LENGTH_LONG).show()

            }
        }

    }

}