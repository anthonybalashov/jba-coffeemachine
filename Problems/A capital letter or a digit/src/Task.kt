import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    var s1 = scanner.next().single()
    if (s1 != '0')  if (s1.isDigit() || s1.isUpperCase()) println("true") else println("false") else print("false")
}