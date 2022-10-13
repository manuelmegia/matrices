fun main(args: Array<String>) {
    var x = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    var xe = "1 2 3 4\n4 5 6 7\n7 8 9 1\n6 5 3 1"
    var xoxo = xe.split("\n")
    estructura(xoxo.size)
    repeat(xoxo.size) {
        print(it + 1)
        print(" | ")
        print(xoxo[it])
        println()
    }
    println()

    estructura(xoxo.size)
    repeat(xoxo.size + 2) {
        print(it + 1)
        print(" | ")
        for (i in xoxo.indices) {
            print(xoxo[i][it])
            print(" ")
        }
        println()
    }
}

fun estructura(j: Int) {
    repeat(j) {
        if (it == 0) print("    ")
        print(it + 1)
        print(" ")
    }
    println()
    repeat(j) {
        if (it == 0) print("  |")
        print("--")
    }
    println()
}