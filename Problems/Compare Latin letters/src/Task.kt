import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val s1 = scanner.next().first()
    val s2 = scanner.next().first()
    val s3 = s1.toUpperCase()
    val s4 = s2.toUpperCase()
    println(s3 == s4)

}
