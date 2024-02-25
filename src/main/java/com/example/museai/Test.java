package com.example.museai;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
     public static void main(String[] args) throws IOException {

         Database d = new Database();
         ArrayList<Song> songList = d.readDatabase();
         ArrayList<Music> musicList = new ArrayList<>();
         Genre genre = new Genre();
         int rock = 0;
         int pop = 0;
         int hiphop = 0;
         int classical = 0;
         int country = 0;
         int rb = 0;
         int unknown =0;



         for(Song s : songList)
         {
             String g = genre.getGenre(s);
             if(g.equals("Rock"))
                 rock++;
             else if (g.equals("Pop"))
                 pop++;
             else if (g.equals("Hip-Hop"))
                 hiphop++;
             else if (g.equals("R&B"))
                 rb++;
             else if(g.equals("Classical"))
                 classical++;
             else if(g.equals("Country"))
                 country++;
             else
                 unknown++;
             Music music = new Music(s.songName,s.artistName,g);
             musicList.add(music);

         }
         System.out.println(musicList);
         System.out.println("Rock= "+ rock);
         System.out.println("Pop= "+ pop);
         System.out.println("Country= "+ country);
         System.out.println("Classical= "+ classical);
         System.out.println("R&B= "+ rb);
         System.out.println("Hip-Hop= "+hiphop);
         System.out.println("Unknown= "+ unknown);


    }
}
