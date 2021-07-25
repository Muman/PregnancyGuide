package io.pregguide.presentation.app

import android.app.Application
import com.facebook.stetho.Stetho
import io.pregguide.BuildConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            initStetho()
        }
    }

    private fun initStetho() {
        Stetho.initializeWithDefaults(this)
    }
}