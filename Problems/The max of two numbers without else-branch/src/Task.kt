import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    // put your code here
    println(if (a < b) b else a)
}