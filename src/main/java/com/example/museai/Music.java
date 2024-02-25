package com.example.museai;

public class Music {

    private String songName;
    private String artistName;
    private String genre;

    public Music(String songName, String artistName, String genre) {
        this.songName = songName;
        this.artistName = artistName;
        this.genre = genre;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Music{" +  "songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                "genre='" + genre + '\'' +
                "}\n";
    }
}
