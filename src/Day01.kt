fun main() {
    val input = readInput("day1")

    // part 1
    input.fold(mutableListOf(mutableListOf<Int>())) { acc, item ->
        if (item.isNotEmpty()) acc.last().add(item.toInt())
        else acc.add(mutableListOf())
        acc
    }.maxOfOrNull { it.sum() }.println()

    // part 2
    input.fold(mutableListOf(mutableListOf<Int>())) { acc, item ->
        if (item.isNotEmpty()) acc.last().add(item.toInt())
        else acc.add(mutableListOf())
        acc
    }.map { it.sum() }.sortedDescending().take(3).sum().println()
}
