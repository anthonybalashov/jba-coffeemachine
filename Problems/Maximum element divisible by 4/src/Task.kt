import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = 0

    repeat(scanner.nextInt()) {
        val num = scanner.nextInt()
        if (num.rem(4) == 0) max = max.coerceAtLeast(num)
    }
    println(max)
}