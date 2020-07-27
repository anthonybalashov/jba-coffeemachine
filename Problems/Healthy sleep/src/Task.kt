import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val s1 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val s3 = scanner.nextInt()

    if (s3 in s1..s2) println("Normal")
    if (s2 in s1..s3) println("Excess")
    if (s1 in s3..s2) println("Deficiency")
}