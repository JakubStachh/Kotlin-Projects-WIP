data class Interval(val start: Int, val end: Int)

fun mergeIntervals(intervals: List<Interval>): List<Interval> {
    if (intervals.isEmpty()) return intervals

    val sortedIntervals = intervals.sortedBy { it.start }
    val mergedIntervals = mutableListOf(sortedIntervals[0])

    for (i in 1 until sortedIntervals.size) {
        val lastMerged = mergedIntervals.last()
        val current = sortedIntervals[i]

        if (lastMerged.end >= current.start) {
            mergedIntervals[mergedIntervals.size - 1] = Interval(lastMerged.start, maxOf(lastMerged.end, current.end))
        } else {
            mergedIntervals.add(current)
        }
    }

    return mergedIntervals
}

fun main() {
    val intervals = listOf(
        Interval(1, 3),
        Interval(2, 4),
        Interval(5, 7),
        Interval(6, 8)
    )
    mergeIntervals(intervals).forEach { println("[${it.start}, ${it.end}]") }
}
