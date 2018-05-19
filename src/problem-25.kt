import java.math.BigDecimal

// Finished!
// Run to see the solution

fun main(args: Array<String>) {
    var prev: BigDecimal = BigDecimal(0)
    var cur: BigDecimal = BigDecimal(1)
    var fib: BigDecimal = BigDecimal(1)
    var index: Int = 1

    while (true) {
        println("Fib: " + fib)

        fib = prev.plus(cur)
        prev = cur
        cur = fib

        index = index.inc()

        if (fib.toPlainString().length == 1000) {
            println("Fib: " + fib)

            break
        }
    }

    println("Solution: " + index)
}