package com.kariot.blogapp;

public class ModelNews {
    private String newsTitle,newsDesc,newsImg,newsURL;

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public String getNewsURL() {
        return newsURL;
    }

    public ModelNews(String newsTitle, String newsDesc, String newsImg, String newsURL) {
        this.newsTitle = newsTitle;
        this.newsDesc = newsDesc;
        this.newsImg = newsImg;
        this.newsURL = newsURL;
    }
}
