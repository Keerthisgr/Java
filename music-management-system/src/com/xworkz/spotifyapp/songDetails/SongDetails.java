package com.xworkz.spotifyapp.songDetails;

import com.xworkz.spotifyapp.song.Song;

import java.sql.SQLOutput;

public class SongDetails{
    Song song;
    public boolean addSong(Song song){
        boolean isSongAdded = false;
        if(song != null){
            if(song.getSongId() > 0 && song.getLanguage()!= null)
            {
                this.song = song;
                isSongAdded = true;
            }
            else{
                System.out.println("No empty space");
            }
        }else{
            System.out.println("Already filled!!...");
        }return isSongAdded;
    }
    public void getDetails(){
        System.out.println("Song id: "+song.getSongId());
        System.out.println("Language:"+song.getLanguage());
        System.out.println("Artist name: "+song.getArtistsName());
        System.out.println("Duration: "+song.getDurationInMins());

    }

}
