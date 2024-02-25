package com.example.museai;

import java.io.IOException;
import java.util.ArrayList;

public class Genre {
    Database d = new Database();


    public String getGenre(Song s) throws IOException {

        String genre = " ";

            double dance = s.getDanceability();
            double energy = s.getEnergy();
            double a = s.getAcousticness();
            double temp = s.getTempo();
            double instrument = s.getInstrument();

            if ((dance >= .6 && dance <= .8) && (energy >= .5 && energy <= .8) && (a >= .1 && a <= .3) && (temp >= 100 && temp <= 130) && (instrument >= 0 && instrument <= .2)) {
                genre= "Pop";
            } else if ((dance >= .5 && dance <= .7) && (energy >= .6 && energy <= .9) && (a >= .01 && a <= .2) && (temp >= 110 && temp <= 140) && (instrument >= 0.2 && instrument <= .5)) {
                genre= "Rock";
            } else if ((dance >= .7 && dance <= .9) && (energy >= .5 && energy <= .9) && (a >= .1 && a <= .3) && (temp >= 80 && temp <= 120) && (instrument >= 0.0 && instrument <= .2)) {
                genre= "Hip-Hop";
            } else if ((dance >= .6 && dance <= .8) && (energy >= .3 && energy <= .7) && (a >= .2 && a <= .4) && (temp >= 60 && temp <= 100) && (instrument >= 0.0 && instrument <= .2)) {
                genre= "R&B";
            } else if ((dance >= .2 && dance <= .6) && (energy >= .1 && energy <= .7) && (a >= .9 && a <= 1.0) && (temp >= 40 && temp <= 180) && (instrument >= 0.5 && instrument <= 1.0)) {
                genre= "Classical";
            }else if ((dance >= .5 && dance <= .75) && (energy >= .5 && energy <= .8) && (a >= .2 && a <= .5) && (temp >= 80 && temp <= 140) && (instrument >= 0 && instrument <= 0.2)) {
                genre= "Country";
            }


        return genre;

    }

}
