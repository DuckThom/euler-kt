

fun main(args: Array<String>) {
    var solution: Int = 75
    val pyramid: Array<IntArray> = arrayOf(
            intArrayOf(95,64),
            intArrayOf(17,47,82),
            intArrayOf(18,35,87,10),
            intArrayOf(20,4,82,47,65),
            intArrayOf(19,1,23,75,3,34),
            intArrayOf(88,2,77,73,7,63,67),
            intArrayOf(99,65,4,28,6,16,70,92),
            intArrayOf(41,41,26,56,83,40,80,70,33),
            intArrayOf(41,48,72,33,47,32,37,16,94,29),
            intArrayOf(53,71,44,65,25,43,91,52,97,51,14),
            intArrayOf(70,11,33,28,77,73,17,78,39,68,17,57),
            intArrayOf(91,71,52,38,17,14,91,43,58,50,27,29,48),
            intArrayOf(63,66,4,68,89,53,67,30,73,16,69,87,40,31),
            intArrayOf(4,62,98,27,23,9,70,98,73,93,38,53,60,4,23)
    )

    var lastIndex: Int = 0

    for (row in pyramid) {
        val scanValues: IntArray = intArrayOf(
                row[lastIndex],
                row[lastIndex + 1]
        )
        val max: Int? = scanValues.max()

        lastIndex = row.indexOf(max ?: 0)

        solution = solution.plus(max ?: 0)
    }

    println(solution)
}