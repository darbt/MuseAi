package com.example.museai;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
     public static void main(String[] args) throws IOException {

         Database d = new Database();
         ArrayList<Song> songList = d.readDatabase();
         ArrayList<Music> musicList = new ArrayList<>();
         Genre genre = new Genre();

         for(Song s : songList)
         {
             genre.getGenre(s);


         }


    }
}
