package pramonow.com.koinexample

import android.content.Context
import android.util.Log

class RealKoin(context: Context):KoinInterface{

    override fun stopThings() {
        Log.d("baniman", "real stop")
    }

    override fun startThings() {
        Log.d("baniman", "real start")
    }

}