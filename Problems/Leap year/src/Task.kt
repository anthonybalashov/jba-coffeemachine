import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val s1 = scanner.nextInt()
  //  println(s1 % 4)
    if (s1 in 1899 .. 3001) println(if ((s1 % 4 == 0) && (s1 % 100 != 0) || (s1 % 400 == 0)) "Leap" else "Regular")
}