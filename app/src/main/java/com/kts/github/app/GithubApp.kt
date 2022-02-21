package com.kts.github.app

import android.app.Application
import com.kts.github.data.network.Networking

class GithubApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Networking.init(this)
    }
}