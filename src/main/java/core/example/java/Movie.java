package core.example.java;

public class Movie {
    private String name;
    private String director;
    private String stuntMaster;
    private String numberOfArtists;
    private String releaseDate;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", stuntMaster='" + stuntMaster + '\'' +
                ", numberOfArtists='" + numberOfArtists + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    public Movie(String name, String director, String stuntMaster, String numberOfArtists, String releaseDate) {
        this.name = name;
        this.director = director;
        this.stuntMaster = stuntMaster;
        this.numberOfArtists = numberOfArtists;
        this.releaseDate = releaseDate;
    }
}
