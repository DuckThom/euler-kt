import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

// Finished!
// Run to see the solution

fun isReversiblePrimeSquare(primeSquare: Long, primes: List<Int>): Boolean {
    // Palindromes not allowed
    if (primeSquare.toString() == primeSquare.toString().reversed()) {
        return false
    }

    val reversedPrimeRoot = sqrt(primeSquare.toString().reversed().toDouble())

    // Check if reversed prime is squared prime
    if (
        reversedPrimeRoot != reversedPrimeRoot.roundToInt().toDouble() ||
        !primes.contains(reversedPrimeRoot.roundToInt())
    ) {
        return false
    }

    return true
}

fun main(args: Array<String>) {
    var solution: Long = 0
    // Imported function from problem #10
    val primes = generatePrimesSieve(32000000) // A bit of trial and error was involved to get this limit
    var i = 0

    for (prime in primes) {
        val primeSquare = prime.toDouble().pow(2.0).toLong()

        if (isReversiblePrimeSquare(primeSquare, primes)) {
            solution += primeSquare
            i++
        }

        if (i == 50) {
            break
        }
    }

    println("Solution: $solution")
}