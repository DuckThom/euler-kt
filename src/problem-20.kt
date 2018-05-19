import java.math.BigDecimal

// Finished!
// Run to see the solution

fun main(args: Array<String>) {
    val numbers: String = factorial(100L).toPlainString()

    println("Numbers: " + numbers)

    var solution: Int = 0

    for (num in numbers) {
        val n: Int = Integer.parseInt(num.toString())

        solution = solution.plus(n)
    }

    println("Solution: " + solution)
}

fun factorial(start: Long): BigDecimal {
    var result: BigDecimal = start.toBigDecimal()
    var num: Int = start.toInt()

    while (num > 1) {
        result = result.times(num.toBigDecimal())
        num = num.minus(1)
    }

    return result
}