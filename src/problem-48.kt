import java.math.BigDecimal

// Finished!
// Run to see the solution

fun main(args: Array<String>) {
    var solution: BigDecimal = BigDecimal(0)

    for (num in 1..1000) {
        val pow: BigDecimal = power(num)

        solution = solution.plus(pow)
    }

    println("Solution: " + solution.toPlainString().substring(solution.toPlainString().length.minus(10)))
}

fun power(num: Int): BigDecimal {
    var i: BigDecimal = BigDecimal(num)

    for (n in 1 until num) {
        i = i.times(num.toBigDecimal())
    }

    return i
}