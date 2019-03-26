/*
 *    Copyright 2018 Maarten de Goede
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package eu.insertcode.traveltipsii.view.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.insertcode.traveltipsii.AppData
import eu.insertcode.traveltipsii.R
import eu.insertcode.traveltipsii.databinding.FragmentTipBinding
import eu.insertcode.traveltipsii.repository.CityRepository
import eu.insertcode.traveltipsii.viewModel.CityViewModel

/**
 * Created by maarten on 2018-02-28.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
class TipFragment : Fragment() {
    companion object {
        const val ARGUMENT_CITY = "eu.insertcode.traveltipsii.view.fragment.TipFragment.ARGUMENT_CITY"
        fun newInstance(city: CityRepository) = TipFragment().apply {
            arguments = Bundle().apply { putInt(ARGUMENT_CITY, city.id) }
        }
    }

    private lateinit var city: CityRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null) {
            city = AppData.getCity(arguments?.getInt(ARGUMENT_CITY)!!)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<FragmentTipBinding>(inflater, R.layout.fragment_tip, container, false)
        binding.cityViewModel = CityViewModel(city)
        return binding.root
    }
}
