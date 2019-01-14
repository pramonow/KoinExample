package pramonow.com.koinexample

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import org.koin.dsl.module.module

val appModule = module{
    single{ RealKoin(get()) as KoinInterface }
    single{ MockKoin(get())}
}

class ApplicationWrapper : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}