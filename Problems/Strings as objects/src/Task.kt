fun main() {
    val input = readLine()!!
    // write code here
    var res = ""



    if (input.isEmpty()) { println(input) } else {
        if (input.first() == 'i') {
            res = input.drop(1)
            println(res.toInt() + 1)
        } else
        if (input.first() == 's') {
            res = input.drop(1)
            println(res.reversed())
        } else println(input)

    }
}