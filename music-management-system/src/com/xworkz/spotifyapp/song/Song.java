package com.xworkz.spotifyapp.song;

public class Song {
    private int songId;
    private String language;
    private String artistsName;
    private int durationInMins;

    public Song() {
        System.out.println("Default constructor is invoked!!..");
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getSongId() {
        return songId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setArtistsName(String artistsName) {
        this.artistsName = artistsName;
    }

    public String getArtistsName() {
        return artistsName;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public int getDurationInMins() {
        return durationInMins;
    }
}
