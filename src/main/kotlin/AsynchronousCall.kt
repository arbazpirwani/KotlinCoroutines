import kotlinx.coroutines.*
import java.net.URL

fun main() {

    suspend fun getCurrentIpAddress(): String {
        return  withContext(Dispatchers.IO){
             URL("http://api.ipify.org/").readText()
        }
    }


    GlobalScope.launch {
        println("current ip address is ${getCurrentIpAddress()}")
    }

    //just to make sure api returns
    Thread.sleep(2000)

}

