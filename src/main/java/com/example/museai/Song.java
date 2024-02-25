package com.example.museai;

public class Song {

    private String songName;
    private String artistName;
    private int popularity;
    private double danceability;
    private double energy;
    private int key;
    private double loudness;
    private int mode;
    private double speechiness;
    private double acousticness;
    private double instrument;
    private double liveness;
    private double valence;
    private double tempo;
    private int duration;



    public Song(String songName, String artistName, int popularity, double danceability, double energy, int key, double loudness, int mode, double speechiness, double acousticness, double instrument, double liveness, double valence, double tempo, int duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.popularity = popularity;
        this.danceability = danceability;
        this.energy = energy;
        this.key = key;
        this.loudness = loudness;
        this.mode = mode;
        this.speechiness = speechiness;
        this.acousticness = acousticness;
        this.instrument = instrument;
        this.liveness = liveness;
        this.valence = valence;
        this.tempo = tempo;
        this.duration = duration;
    }

    public double getEnergy() {
        return energy;
    }
    public void setEnergy(double energy) {
        this.energy = energy;
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

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public double getDanceability() {
        return danceability;
    }

    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getLoudness() {
        return loudness;
    }

    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public double getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(double speechiness) {
        this.speechiness = speechiness;
    }

    public double getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(double acousticness) {
        acousticness = acousticness;
    }

    public double getInstrument() {
        return instrument;
    }

    public void setInstrument(double instrument) {
        this.instrument = instrument;
    }

    public double getLiveness() {
        return liveness;
    }

    public void setLiveness(double liveness) {
        this.liveness = liveness;
    }

    public double getValence() {
        return valence;
    }

    public void setValence(double valence) {
        this.valence = valence;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", popularity=" + popularity +
                ", danceability=" + danceability +
                ", energy=" + energy +
                ", key=" + key +
                ", loudness=" + loudness +
                ", mode=" + mode +
                ", speechiness=" + speechiness +
                ", acousticness=" + acousticness +
                ", instrument=" + instrument +
                ", liveness=" + liveness +
                ", valence=" + valence +
                ", tempo=" + tempo +
                ", duration=" + duration +
                '}';
    }
}
