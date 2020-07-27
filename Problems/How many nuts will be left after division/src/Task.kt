import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val k = scanner.nextInt()
    val n = scanner.nextInt()
    var result = n % k
    println(result)
}
