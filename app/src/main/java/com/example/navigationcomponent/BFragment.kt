package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationcomponent.databinding.FragmentBBinding

class BFragment : Fragment() {

    private val bBinding: FragmentBBinding by lazy {
        FragmentBBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bBinding.buttonFragmentB.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("name", "Bugra")

            NavHostFragment.findNavController(this)
                .navigate(R.id.action_BFragment_to_AFragment, bundle)

        }


        return bBinding.root
    }

}