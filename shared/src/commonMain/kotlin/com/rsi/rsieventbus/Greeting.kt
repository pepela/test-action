package com.rsi.rsieventbus

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Chiao, ${platform.name}!"
    }
}
