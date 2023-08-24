package com.helinavci.kotlinakademiweek6hwq2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.helinavci.kotlinakademiweek6hwq2.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment() {
    private lateinit var tasarim : FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       tasarim = FragmentMainPageBinding.inflate(inflater , container , false)
        tasarim.buttonDetayGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_detayPageFragment)
        }
        return tasarim.root
    }


}