import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val s1 = scanner.next().first().toInt()
    val s2 = scanner.next().first().toInt()
    val s3 = scanner.next().first().toInt()


    if (((s3 - s2 )== 1) && ((s2 - s1 )== 1)) println("true") else println("false")



}