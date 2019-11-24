import java.net.URL

fun main() {

    fun getCurrentIpAddress(): String {
        return URL("http://api.ipify.org/").readText()
    }


    println("current ip address is ${getCurrentIpAddress()}")
}

