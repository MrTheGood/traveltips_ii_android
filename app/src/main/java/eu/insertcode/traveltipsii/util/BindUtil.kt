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

package eu.insertcode.traveltipsii.util

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide
import eu.insertcode.traveltipsii.repository.TipRepository
import eu.insertcode.traveltipsii.view.adapter.TipAdapter

/**
 * Created by maarten on 2018-03-08.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
@BindingAdapter("tools:imageUrl")
fun loadImage(imageView: ImageView, imageUrl: String) {
    Glide.with(imageView).load(imageUrl).into(imageView)
}

@BindingAdapter("tools:tipList")
fun loadTips(recyclerView: RecyclerView, tips: ArrayList<TipRepository>) {
    recyclerView.adapter = TipAdapter(recyclerView.context, tips)
}