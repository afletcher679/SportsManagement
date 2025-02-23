package org.sports_management

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GreetingViewModel: KoinComponent {
    private val greeting : Greeting by inject()
    fun greet() : String = greeting.greet()
}