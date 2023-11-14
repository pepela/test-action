package com.rsi.rsieventbus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform