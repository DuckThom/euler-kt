import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

// Finished!
// Run to see the solution

fun generatePrimesSieve(limit: Int): BooleanArray {
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

    return numbers
}

fun main(args: Array<String>) {
    val primes = generatePrimesSieve(2000000)

    var solution: Long = 0
    primes.forEachIndexed {
        index, value -> if (value) solution += index
    }

    println("Solution: $solution")
}