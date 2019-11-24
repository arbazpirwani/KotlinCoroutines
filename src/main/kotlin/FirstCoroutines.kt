import kotlinx.coroutines.*

fun main() {

    val deferred = (1..1_000_000).map { n ->
        GlobalScope.async {
            n
        }
    }
    runBlocking {
        val sum = deferred.sumBy { it.await() }
        println("Sum $sum")
    }


}
