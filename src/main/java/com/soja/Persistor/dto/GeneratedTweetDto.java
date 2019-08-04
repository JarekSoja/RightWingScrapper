package com.soja.Persistor.dto;

public class GeneratedTweetDto {

    private String tweetText;
    private boolean wasPublished;
    private boolean wasAutogenerated;

    public GeneratedTweetDto(String tweetText, boolean wasPublished, boolean wasAutogenerated) {
        this.tweetText = tweetText;
        this.wasPublished = wasPublished;
        this.wasAutogenerated = wasAutogenerated;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public boolean getWasPublished() {
        return wasPublished;
    }

    public void setWasPublished(boolean wasPublished) {
        this.wasPublished = wasPublished;
    }

    public boolean getWasAutogenerated() {
        return wasAutogenerated;
    }

    public void setWasAutogenerated(boolean wasAutogenerated) {
        this.wasAutogenerated = wasAutogenerated;
    }
}