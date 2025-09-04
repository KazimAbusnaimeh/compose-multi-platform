package org.example.composemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform