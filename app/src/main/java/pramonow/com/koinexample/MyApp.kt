package pramonow.com.koinexample

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module

//Creating modules to be injected here
//Using single to only allow on instance for every type of class
val appModule = module{
    //KoinClass injector
    single{ KoinClass()}
    //Koin will inject app context into the constructor
    single{ KoinParamClass(get()) as KoinInterface }
    //Koin get will find and inject Object that was needed for the constructor
    //The Object will need to be stored inside the context of Koin before hand
    single{ ConstructorInject(get())}
}

class ApplicationWrapper : Application() {
    override fun onCreate() {
        super.onCreate()
        //start koin and passing application context
        startKoin(this, listOf(appModule))
    }
}