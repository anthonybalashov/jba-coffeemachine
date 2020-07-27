class Application(val name: String) {

    // write the run method here
    fun run(external_array: Array<String>){
        println(name)
        for (element in external_array) {
            println(element)
        }
    }
}