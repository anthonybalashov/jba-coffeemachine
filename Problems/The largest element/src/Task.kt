import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var tmp = 0
    var s1 = 0

    do {
        s1 = scanner.nextInt()
        if (s1 > tmp) tmp = s1
    } while (s1 != 0)
    println(tmp)
}