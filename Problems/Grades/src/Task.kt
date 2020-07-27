import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val s1 = scanner.nextInt()
    var five = 0
    var four = 0
    var three = 0
    var two = 0


    repeat(s1){
        var s2 = scanner.nextInt()
        if (s2 == 5) five++
        if (s2 == 4) four++
        if (s2 == 3) three++
        if (s2 == 2) two++
    }
    println("$two $three $four $five")
}