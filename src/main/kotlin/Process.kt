import kotlinx.coroutines.*

fun main() {

    fun process(n: Int): Int {
        println("Process ${Thread.currentThread()}")
        return n
    }

    println(Thread.currentThread())
    GlobalScope.launch {
        println(process(3))
    }

    Thread.sleep(2000)
}