package com.rsi.rsieventbus

class AndroidPlatform : Platform {
    override val name: String = "Android piu view ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
