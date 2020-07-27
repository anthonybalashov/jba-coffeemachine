import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()
    var i = 1
    var count = 0
    var icount = 1
    while (count < num){
        print("${i} ")
        count++
        icount++
        if (icount >= i){
            i++
            icount=0
        }
    }
}