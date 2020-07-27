import java.util.Scanner

// write your function here
fun isVowel(a: Char) : Boolean {
    return "AEIOUaeiou".indexOf(a) != -1;
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}