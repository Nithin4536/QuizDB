package com.example.quizproject;

public class savedata {
    String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getFscore() {
        return fscore;
    }

    public void setFscore(int fscore) {
        this.fscore = fscore;
    }

    public savedata(String fname, int fscore) {
        this.fname = fname;
        this.fscore = fscore;
    }

    int fscore;

}