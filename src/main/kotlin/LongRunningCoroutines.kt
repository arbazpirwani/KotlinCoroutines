import kotlinx.coroutines.*

fun main() = runBlocking{
    val jobs = List(100_000) {
        GlobalScope.launch {
            delay(1000)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}