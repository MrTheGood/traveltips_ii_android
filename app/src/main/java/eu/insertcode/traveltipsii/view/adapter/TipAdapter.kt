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

package eu.insertcode.traveltipsii.view.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import eu.insertcode.traveltipsii.R
import eu.insertcode.traveltipsii.databinding.ItemTipBinding
import eu.insertcode.traveltipsii.repository.TipRepository
import eu.insertcode.traveltipsii.viewModel.TipViewModel

/**
 * Created by maarten on 2018-02-28.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
class TipAdapter(
        private val context: Context,
        private val tips: List<TipRepository>
) : RecyclerView.Adapter<TipAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            Holder(DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_tip, parent, false))

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.tipViewModel = TipViewModel(tips[position])
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = tips.size

    class Holder(val binding: ItemTipBinding) : RecyclerView.ViewHolder(binding.cardView)
}