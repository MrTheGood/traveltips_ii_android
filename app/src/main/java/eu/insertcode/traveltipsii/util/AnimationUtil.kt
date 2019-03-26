package eu.insertcode.traveltipsii.util

import android.content.Context
import android.view.View

/**
 * Created by maarten on 2018-03-21.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
inline fun Context.registerCircularRevealAnimation(view: View, settings: RevealAnimationSettings, startColour: Int, endColour: Int) {
    view.addOnLayoutChangeListener(View.OnLayoutChangeListener { v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->
        v.removeOnLayoutChangeListener(this)//todo: replace this with View.OnLayoutChangeListener
        val cx = settings.centerX
        val cy = settings.centerY
        val width = settings.width
        val height = settings.height
        val duration = resources.getInteger(android.R.integer.config_mediumAnimTime)

        //todo:
    })
}