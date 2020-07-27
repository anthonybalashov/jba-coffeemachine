import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var fixing: Int = 0
    var reject: Int = 0
    var perfect: Int = 0
    repeat(scanner.nextInt()) {
        when (scanner.nextInt()) {
            1 -> fixing++
            -1 -> reject++
            0 -> perfect++
        }
    }
    print("$perfect $fixing $reject")
}