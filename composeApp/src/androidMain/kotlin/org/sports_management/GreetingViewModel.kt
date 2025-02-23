package org.sports_management

import androidx.lifecycle.ViewModel

class GreetingViewModel(val greeting: Greeting) : ViewModel() {
    fun print() = greeting.greet()
}