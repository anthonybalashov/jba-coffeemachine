

object PlayingField {


    object Size {
        var width: Int = 0
        var height: Int = 0

        fun changeSize(width: Int, height: Int){
            if (width < 0) Size.width = 0 else Size.width = width
            if (height < 0) Size.height = 0 else Size.height = height

        }

    }
}