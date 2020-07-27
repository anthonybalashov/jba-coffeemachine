import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var start = 0
    var count = 1
    var max = Int.MIN_VALUE
    while (scanner.hasNext()) {
        val num = scanner.nextInt()
        if (num > max) {
            max = num
            start = count
        }
        count++
    }
    println("$max $start")
}
