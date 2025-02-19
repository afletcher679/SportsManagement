package org.sports_management

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform