package com.boring.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform