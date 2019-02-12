package pramonow.com.koinexample

class ConstructorInject(val koin:KoinInterface){
    fun askKoinStart(){
        koin.startThings()
    }
}