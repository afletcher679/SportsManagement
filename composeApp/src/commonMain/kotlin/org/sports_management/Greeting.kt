package org.sports_management

class Greeting(val platform: Platform) {

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}