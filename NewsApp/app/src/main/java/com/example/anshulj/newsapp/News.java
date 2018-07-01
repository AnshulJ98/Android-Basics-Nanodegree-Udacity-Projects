package com.example.anshulj.newsapp;

public class News {

    private String mTitle;
    private String mAuthor;
    private String mSection;
    private String mPDate;
    private String mUrl;

    public News(String title, String author, String section, String pDate, String url) {
        mTitle = title;
        mAuthor = "by " + author;
        mSection = section;
        mPDate = pDate;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getPDate() {
        return mPDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
