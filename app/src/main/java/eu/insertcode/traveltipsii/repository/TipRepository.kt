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

package eu.insertcode.traveltipsii.repository

import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by maarten on 2018-02-28.
 * Copyright © 2018 insertCode.eu. All rights reserved.
 */
class TipRepository : Observable() {
    private val onChanged = { property: KProperty<*>, _: Any?, _: Any? -> setChanged(); notifyObservers(property.name) }

    val id: Int by Delegates.observable(-1, onChanged)
    val tip: String by Delegates.observable("", onChanged)
    //TODO: Rating
    //LODO: User
}