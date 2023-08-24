package com.helinavci.kotlinakademiweek6hwq2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.helinavci.kotlinakademiweek6hwq2.databinding.FragmentDetayPageBinding


class DetayPageFragment : Fragment() {
private lateinit var tasarim : FragmentDetayPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tasarim = FragmentDetayPageBinding.inflate(inflater , container , false)
        tasarim.buttonCikisGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_detayPageFragment_to_closingFragment)
        }
        return tasarim.root
    }

}