import java.util.Scanner

enum class Currency(val country: String, val curr: String) {
    GERMANY("Germany","Euro"),
    MALI("Mali","CFA franc"),
    DOMINICA("Dominica","Eastern Caribbean dollar"),
    CANADA("Canada","Canadian dollar"),
    SPAIN("Spain","Euro"),
    AUSTRALIA("Australia","Australian dollar"),
    BRAZIL("Brazil","Brazilian real"),
    SENEGAL("Senegal","CFA franc"),
    FRANCE("France","Euro"),
    GRENADA("Grenada","Eastern Caribbean dollar"),
    KIRIBATI("Kiribati","Australian dollar"),
    NULL("NULL","NULL");

    companion object {
        fun getCurr(country: String): Currency {
            for (enum in Currency.values()) {
                if (country.toUpperCase() == enum.name) return enum
            }
            return NULL
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val s1 = input.next()
    val s2 = input.next()
    println(if (Currency.getCurr(s1).curr == Currency.getCurr(s2).curr)  "true" else "false" )




}