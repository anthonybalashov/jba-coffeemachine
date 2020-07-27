import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val s1 = scanner.nextLine()
    val s2 = scanner.nextLine()
    val s3 = scanner.nextLine()

    when (s2) {
        "equals" -> println(s1 == s3)
        "plus" -> println(s1+s3)
        "endsWith" -> println(s1.endsWith(s3))
        else -> println("Unknown operation")
    }
}