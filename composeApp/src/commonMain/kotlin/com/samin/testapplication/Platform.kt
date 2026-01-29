package com.samin.testapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform