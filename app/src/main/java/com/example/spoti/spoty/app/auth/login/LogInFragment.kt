package com.example.spoti.spoty.app.auth.login

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.spotify.megaapp.R
import com.spotify.megaapp.databinding.FragmentLogInBinding
import dagger.hilt.android.lifecycle.HiltViewModel


class LogInFragment : Fragment() {


    private var _binding: FragmentLogInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View {
        _binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var username = arguments?.getString("username")

        if (username != null) {
            val editable = Editable.Factory.getInstance().newEditable(username)
            binding.etUsername.text = editable
        }

        binding.btnLogIn.setOnClickListener {

            if (binding.etUsername.text.isNotBlank() && binding.etPassword.text.isNotBlank()) {

                val bundle = Bundle().apply {
                    putString("username", binding.etUsername.text.toString())
                }
                findNavController().navigate(R.id.action_logIn_to_menuFragment, bundle)
            } else {
                Toast.makeText(requireContext(), "Wrong Username or Password", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        binding.btnLogInFacebook.setOnClickListener {
            findNavController().navigate(R.id.action_logIn_to_facebookLogInFragment)
        }
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_logIn_to_signUpFragment)
        }
        binding.btnResetPassword.setOnClickListener {

            if (binding.etUsername.text.isNotBlank()) {
                val bundle = Bundle().apply {
                    putString("username", binding.etUsername.text.toString())
                }
                findNavController().navigate(R.id.resetPasswordFragment, bundle)
            } else {
                Toast.makeText(requireContext(), "Enter a correct username", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }
}