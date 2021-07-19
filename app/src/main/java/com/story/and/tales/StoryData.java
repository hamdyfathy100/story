package com.story.and.tales;

public class StoryData {

    private String nameStory;
    private String textStory;
    private String linkImage;
    private String today;
    private String month;
    private String year;

    public StoryData(String nameStory, String textStory, String linkImage, String today, String month, String year) {
        this.nameStory = nameStory;
        this.textStory = textStory;
        this.linkImage = linkImage;
        this.today = today;
        this.month = month;
        this.year = year;
    }

    public String getNameStory() {
        return nameStory;
    }

    public String getTextStory() {
        return textStory;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public String getToday() {
        return today;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
