import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val s1 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val s3 = scanner.nextInt()
    val s4 = scanner.nextInt()
    val s5 = scanner.nextInt()

    println(if ((s5 in s1..s2)  || (s5 in s3..s4)) "true" else "false")
}