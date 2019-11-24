fun main() {
    val sequence = sequence {
        println("one")
        yield(1)

        println("two")
        yield(2)

        println("three")
        yield(3)

        println("done")
    }

    for (value in sequence) {
        println("the value is $value")
    }
}