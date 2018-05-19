import java.lang.Math.pow
import java.math.BigDecimal

// Finished!
// Run to see the solution

fun main(args: Array<String>) {
    val base: Int = 2
    val power: Int = 1000

    val numbers: String = BigDecimal(pow(base.toDouble(), power.toDouble())).toPlainString()

    println("Numbers: " + numbers)

    var solution: Int = 0

    for (num in numbers) {
        val n: Int = Integer.parseInt(num.toString())

        solution = solution.plus(n)
    }

    println("Solution: " + solution)
}