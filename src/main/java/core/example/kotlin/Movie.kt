package core.example.kotlin

class Movie (private val name:String, private val director:String,
            private val stuntMaster:String,private val numberOfArtists:String,
            private val releaseDate:String) {
    override fun toString(): String {
        return "Movie(name='$name', director='$director', stuntMaster='$stuntMaster', numberOfArtists='$numberOfArtists', releaseDate='$releaseDate')"
    }
}
