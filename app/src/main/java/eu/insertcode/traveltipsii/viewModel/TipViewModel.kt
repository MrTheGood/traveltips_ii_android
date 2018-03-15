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
import android.util.Log
import android.view.View
import eu.insertcode.traveltipsii.BR
import eu.insertcode.traveltipsii.repository.TipRepository
import java.util.*

/**
 * Created by maarten on 2018-03-08.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
class TipViewModel(
        private val tip: TipRepository
) : BaseObservable(), Observer {
    init {
        tip.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (arg is String) {
            when (arg) {
                "tip" -> notifyPropertyChanged(BR.tipTip)
                "name" -> notifyPropertyChanged(BR.tipName)
            }
        }
    }

    @Bindable
    fun getTipName() = "Name"

    @Bindable
    fun getTipTip() = tip.tip


    val onFavClick = View.OnClickListener { Log.d("temp", "Tip like clicked.") }

    val onShareClick = View.OnClickListener { Log.d("temp", "Tip share clicked.") }
}