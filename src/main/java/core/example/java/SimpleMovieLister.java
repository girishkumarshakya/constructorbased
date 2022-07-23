package core.example.java;

public class SimpleMovieLister {
    private Movie movie;



    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movie=" + movie +
                '}';
    }

    public SimpleMovieLister(Movie movie) {
        this.movie = movie;
    }


}
