class Player(val id: Int, val name: String, val hp: Int){
    companion object game {
        val hp: Int = 100

        fun create(name: String): Player{

            return Player(0,name, hp)
        }
    }
}