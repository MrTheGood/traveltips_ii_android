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

package eu.insertcode.traveltipsii.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import eu.insertcode.traveltipsii.R
import eu.insertcode.traveltipsii.repository.CityRepository
import eu.insertcode.traveltipsii.view.adapter.CityAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        fun newInstance(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var city = CityRepository()
        city.cityName = "Den Haag"
        city.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
        val cityList = arrayListOf(city)

        city = CityRepository()
        city.cityName = "Rotterdam"
        city.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
        cityList.add(city)

        city = CityRepository()
        city.cityName = "Amsterdam"
        city.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
        cityList.add(city)

        city = CityRepository()
        city.cityName = "Utrecht"
        city.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
        cityList.add(city)

        city = CityRepository()
        city.cityName = "Leiden"
        city.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
        cityList.add(city)

        cities_recycler.layoutManager = GridLayoutManager(this, 2)
        cities_recycler.adapter = CityAdapter(this, cityList)
    }
}
