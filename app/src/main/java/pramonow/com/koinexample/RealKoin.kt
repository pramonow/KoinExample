package pramonow.com.koinexample

import android.content.Context
import android.util.Log

class KoinParamClass(context: Context):KoinInterface{

    override fun stopThings() {
        Log.d("KOINCLASS", "KOIN PARAM STOP")
    }

    override fun startThings() {
        Log.d("KOINCLASS", "KOIN PARAM START")
    }

}