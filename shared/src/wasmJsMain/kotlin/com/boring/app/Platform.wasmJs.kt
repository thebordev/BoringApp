package com.boring.app

class WebPlatform : Platform {
    override val name: String = "Web"
}

actual fun getPlatform(): Platform {
    return WebPlatform()
}