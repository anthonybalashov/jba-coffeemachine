import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var balance = scanner.nextInt()
    var res: String = ""
    while (scanner.hasNext()) {
        val value = scanner.nextInt()
        if (value <= balance) {
            balance -= value
            res = "Thank you for choosing us to manage your account! You have $balance money."
        } else {
            res = "Error, insufficient funds for the purchase. You have $balance, but you need $value."
            break
        }

    }
    println(res)
}