package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationcomponent.databinding.FragmentABinding

class AFragment : Fragment() {

    private val aBinding: FragmentABinding by lazy {
        FragmentABinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        aBinding.buttonFragmentB.setOnClickListener {

            NavHostFragment.findNavController(this)
                .navigate(R.id.action_AFragment_to_BFragment)

        }


        return aBinding.root
    }
}