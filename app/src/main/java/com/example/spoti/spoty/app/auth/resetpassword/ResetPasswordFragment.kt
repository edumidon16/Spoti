package com.example.spoti.spoty.app.auth.resetpassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.spotify.megaapp.R
import com.spotify.megaapp.databinding.FragmentResetPasswordBinding


class ResetPasswordFragment : Fragment() {

    private var _binding: FragmentResetPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View {
        _binding = FragmentResetPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = arguments?.getString("username")

        binding.txtName.text = username

        binding.btnResetPassword.setOnClickListener {
            if (binding.etNewPassword1.text.isNotBlank() && binding.etNewPassword2.text.isNotBlank()) {

                if (binding.etNewPassword1 == binding.etNewPassword2) {

                    var bundle = Bundle().apply {
                        putString("username", username)
                    }
                    findNavController().navigate(R.id.action_resetPasswordFragment_to_logIn, bundle)
                } else {
                    Toast.makeText(requireContext(), "Enter the same password", Toast.LENGTH_LONG).show()
                }

            }
        }

    }


}