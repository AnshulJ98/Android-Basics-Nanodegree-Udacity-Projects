package com.example.anshulj.tourguide;


public class item {

    private String mItemName;
    private int mImageResourceId;


    public item(String itemName, int imageResourceId) {
        mItemName = itemName;
        mImageResourceId = imageResourceId;
    }

    public String getItemName() {

        return mItemName;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

}
