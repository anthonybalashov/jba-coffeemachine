import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val s1 = scanner.nextLine()
    val s2 = scanner.nextInt()
    println("Symbol # $s2 of the string \"$s1\" is \'${s1[s2-1]}\'")
}