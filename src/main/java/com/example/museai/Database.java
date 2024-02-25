package com.example.museai;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Database {

    private String musicPathName = "/Users/trintydarbouze/IdeaProjects/MuseAi/SpotifySongs.csv";

    public CSVParser getCSVParser(String musicPathName) throws IOException {
        Path p = Paths.get(musicPathName);
        Reader r = Files.newBufferedReader(p);
        CSVParser csv = new CSVParser(r, CSVFormat.DEFAULT.withFirstRecordAsHeader());
        return csv;


    }

    public ArrayList<Song> readDatabase() throws IOException {
        ArrayList<Song> songList = new ArrayList<Song>();
        CSVParser parse = getCSVParser(musicPathName);
        for(CSVRecord r : parse)
        {
            String songName = r.get("SongName");
            String artistName = r.get("ArtistName");
            int popularity = Integer.parseInt(r.get("Popularity"));
            double dance = Double.parseDouble(r.get("Danceability"));
            double energy = Double.parseDouble(r.get("Energy"));
            int key = Integer.parseInt(r.get("Key"));
            double loud = Double.parseDouble(r.get("Loudness"));
            int mode = Integer.parseInt(r.get("Mode"));
            double speechiness = Double.parseDouble(r.get("Speechiness"));
            double acoust = Double.parseDouble(r.get("Acousticness"));
            double instrument = Double.parseDouble(r.get("Instrumentalness"));
            double live = Double.parseDouble(r.get("Liveness"));
            double vale = Double.parseDouble(r.get("Valence"));
            double tempo = Double.parseDouble(r.get("Tempo"));
            int duration = Integer.parseInt(r.get("Duration_ms"));
            Song song = new Song(songName, artistName, popularity,dance,energy,key,loud,mode,speechiness,acoust,instrument,live,vale,tempo,duration);
            songList.add(song);


        }

        return songList;

    }


}
