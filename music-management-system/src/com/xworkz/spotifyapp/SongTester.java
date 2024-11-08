package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.song.Song;
import com.xworkz.spotifyapp.songDetails.SongDetails;

public class SongTester {
    public static void main(String[] args) {
        Song song = new Song();
        SongDetails sd = new SongDetails();
        song.setSongId(2);
        song.setLanguage("Kannada");
        song.setArtistsName("Aishwarya");
        song.setDurationInMins(45);
        sd.addSong(song);
        sd.getDetails();
    }
}
