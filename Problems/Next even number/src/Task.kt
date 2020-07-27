import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    var delim = number + 1
    var d = 0
  while (d == 0) {
        if (delim % 2 == 0) {
            println(delim)
            d++
        } else
        {
            delim++
        }
    }
}