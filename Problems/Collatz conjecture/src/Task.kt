import java.util.*

fun collatz(n: Int){
    print("$n ")
    if (n == 1) return
    else if (n % 2 == 0) collatz(n / 2)
    else collatz(3 * n + 1)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    collatz(scanner.nextInt())

}