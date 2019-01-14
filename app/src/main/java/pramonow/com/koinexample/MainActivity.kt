package pramonow.com.koinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val koinService: KoinInterface by inject()
    val mockKoin: MockKoin by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koinService.startThings()
        mockKoin.stopThings()
    }
}
