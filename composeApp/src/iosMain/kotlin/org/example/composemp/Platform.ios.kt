package org.example.composemp

class IOSPlatform : Platform {
    override val name: String = ""
}

actual fun getPlatform(): Platform = IOSPlatform()