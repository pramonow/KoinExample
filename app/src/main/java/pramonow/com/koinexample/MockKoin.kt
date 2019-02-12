package pramonow.com.koinexample

import android.util.Log

class KoinClass:KoinInterface{

    override fun startThings() {
        Log.d("KOINCLASS", "KOIN START")
    }

    override fun stopThings() {
        Log.d("KOINCLASS","KOIN STOP")
    }

}