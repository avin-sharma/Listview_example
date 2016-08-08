package com.avinsharma.listviewblog;

/**
 * Created by Avin on 08-08-2016.
 */
public class Number {

    private String mDefaultTranslation;
    private String mSpanishTranslation;

    public Number(String mDefaultTranslation, String mSpanishTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mSpanishTranslation = mSpanishTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmSpanishTranslation() {
        return mSpanishTranslation;
    }
}
