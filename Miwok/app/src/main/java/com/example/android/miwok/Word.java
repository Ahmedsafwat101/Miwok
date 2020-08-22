package com.example.android.miwok;

public class Word {
    private String english;
    private String miwok;
    private  int imageID;
    private int audioID;

    public Word(String english, String miwok, int imageID, int audioID) {
        this.english = english;
        this.miwok = miwok;
        this.imageID=imageID;
        this.audioID= audioID;

    }

    public Word(String english, String miwok, int audioID) {
        this.english = english;
        this.miwok = miwok;
        this.audioID=audioID;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public int getImageID() { return imageID; }

    public int getAudioID() {
        return audioID;
    }
}
