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

import android.annotation.SuppressLint
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import eu.insertcode.traveltipsii.R

/**
 * Created by maarten on 2018-03-09.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    private var currentFragment: Fragment? = null
    private var prevFragment: Fragment? = null
    //todo: allow more back presses than only 1

    fun changePage(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            if (currentFragment?.isHidden == false) hide(currentFragment)
            if (!fragment.isAdded) add(R.id.root, fragment)
            if (!fragment.isVisible) show(fragment)

            prevFragment = currentFragment
            currentFragment = fragment
        }.commit()
    }

    override fun onBackPressed() {
        val prev = this.prevFragment
        if (prev != null) {
            changePage(prev)
            prevFragment = null
        } else {
            super.onBackPressed()
        }
    }
}