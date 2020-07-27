import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val s1 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val s3 = scanner.nextInt()

    println(if (s1 in s2..s3) "true" else "false" )

    // write your code here
}