package pramonow.com.koinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    //Inject the classes
    val koinService: KoinInterface by inject()
    val mockKoin: KoinClass by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koinService.startThings() //will log KOIN PARAM START
        mockKoin.stopThings() // will log KOIN STOP

        //can also directly getting instance this way
        val constructorInject:ConstructorInject = get()
        constructorInject.askKoinStart() //will log KOIN PARAM START
    }
}
