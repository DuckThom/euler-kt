import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

// Finished!
// Run to see the solution

fun generatePrimesSieve(limit: Int): List<Int> {
    val numbers = BooleanArray(limit) { true }

    numbers[0] = false
    numbers[1] = false

    for (i in 2..sqrt(limit.toDouble()).toInt()) {
        if (numbers[i]) {
            for (j in i.toDouble().pow(2.0).toInt() until limit step i) {
                numbers[j] = false
            }
        }
    }

    return numbers.indices.filter { i -> numbers[i] }
}

fun main(args: Array<String>) {
    val primes = generatePrimesSieve(2000000)

    var solution = primes.sumOf { i -> i.toLong() }

    println("Solution: $solution")
}