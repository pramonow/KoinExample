package pramonow.com.koinexample

import android.content.Context
import android.util.Log

class MockKoin(context: Context):KoinInterface{

    override fun startThings() {
        Log.d("baniman", "start")
    }

    override fun stopThings() {
        Log.d("baniman","stop")
    }

}