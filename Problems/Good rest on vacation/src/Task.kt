import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val days = scanner.nextInt()
    val food = scanner.nextInt()
    val fly = scanner.nextInt()
    val night = scanner.nextInt()

    val result : Int = days * (food + night) - night + (fly *2)
    println(result)
}