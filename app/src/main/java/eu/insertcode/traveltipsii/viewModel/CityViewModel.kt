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

package eu.insertcode.traveltipsii.viewModel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View
import eu.insertcode.traveltipsii.BR
import eu.insertcode.traveltipsii.repository.CityRepository
import eu.insertcode.traveltipsii.view.activity.BaseActivity
import eu.insertcode.traveltipsii.view.fragment.TipFragment
import java.util.*

/**
 * Created by maarten on 2018-02-28.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
class CityViewModel(
        private val city: CityRepository
) : BaseObservable(), Observer {
    init {
        city.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (arg is String) {
            when (arg) {
                "cityName" -> notifyPropertyChanged(BR.cityName)
                "imageUrl" -> notifyPropertyChanged(BR.cityImageUrl)
                "tips" -> notifyPropertyChanged(BR.cityTips)
            }
        }
    }


    @Bindable
    fun getCityName() = city.cityName

    @Bindable
    fun getCityImageUrl() = city.imageUrl

    @Bindable
    fun getCityTips() = city.tips


    val clickCityListener = View.OnClickListener { v -> (v?.context as BaseActivity).changePage(TipFragment.newInstance(city)) }

    val clickTipAddListener = View.OnClickListener { v ->
        //todo
    }
}