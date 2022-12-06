fun main() {
    val input = readInput("day1")

    // part 1
    input.fold(mutableListOf(mutableListOf())) { lists: MutableList<MutableList<Int>>, s: String ->
        if (s.isNotEmpty()) {
            lists.last().add(s.toInt())
        } else {
            lists.add(mutableListOf())
        }
        lists
    }.maxOfOrNull { it.sum() }.println()


    // part 2
    input.fold(mutableListOf(mutableListOf())) { lists: MutableList<MutableList<Int>>, s: String ->
        if (s.isNotEmpty()) {
            lists.last().add(s.toInt())
        } else {
            lists.add(mutableListOf())
        }
        lists
    }.map { it.sum() }.sortedDescending().take(3).sum().println()
}
