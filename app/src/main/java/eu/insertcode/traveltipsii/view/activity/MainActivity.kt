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
import eu.insertcode.traveltipsii.AppData
import eu.insertcode.traveltipsii.R
import eu.insertcode.traveltipsii.repository.CityRepository
import eu.insertcode.traveltipsii.repository.TipRepository
import eu.insertcode.traveltipsii.view.fragment.CityFragment

class MainActivity : BaseActivity() {
    companion object {
        fun newIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo: start demo content
        AppData.cities.add(CityRepository().apply {
            id = 0
            cityName = "Den Haag"
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
            tips = arrayListOf(TipRepository().apply {
                id = 0
                tip = "Dit is een voorbeeld tip."
            }, TipRepository().apply {
                id = 1
                tip = "Dit is nog een voorbeeld tip als extra voorbeeld."
            }, TipRepository().apply {
                id = 2
                tip = "Lorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflk"
            })
        })

        AppData.cities.add(CityRepository().apply {
            id = 1
            cityName = "Rotterdam"
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
            tips = arrayListOf(TipRepository().apply {
                id = 0
                tip = "Dit is een voorbeeld tip."
            }, TipRepository().apply {
                id = 1
                tip = "Dit is nog een voorbeeld tip als extra voorbeeld."
            }, TipRepository().apply {
                id = 2
                tip = "Lorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflk"
            })
        })

        AppData.cities.add(CityRepository().apply {
            id = 2
            cityName = "Amsterdam"
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
            tips = arrayListOf(TipRepository().apply {
                id = 0
                tip = "Dit is een voorbeeld tip."
            }, TipRepository().apply {
                id = 1
                tip = "Dit is nog een voorbeeld tip als extra voorbeeld."
            }, TipRepository().apply {
                id = 2
                tip = "Lorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflk"
            })
        })

        AppData.cities.add(CityRepository().apply {
            id = 3
            cityName = "Utrecht"
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
            tips = arrayListOf(TipRepository().apply {
                id = 0
                tip = "Dit is een voorbeeld tip."
            }, TipRepository().apply {
                id = 1
                tip = "Dit is nog een voorbeeld tip als extra voorbeeld."
            }, TipRepository().apply {
                id = 2
                tip = "Lorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflk"
            })
        })

        AppData.cities.add(CityRepository().apply {
            id = 4
            cityName = "Leiden"
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Den_Haag_wapen.svg/320px-Den_Haag_wapen.svg.png"
            tips = arrayListOf(TipRepository().apply {
                id = 0
                tip = "Dit is een voorbeeld tip."
            }, TipRepository().apply {
                id = 1
                tip = "Dit is nog een voorbeeld tip als extra voorbeeld."
            }, TipRepository().apply {
                id = 2
                tip = "Lorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflkLorem ipsum dolor sit amet consecq;alskdf ;lkadnfh owalkb daslfkab dolsfjbe ilaskdbf eilakmsdbjflk"
            })
        })
        //todo: end demo content


        changePage(CityFragment.newInstance())
    }
}
