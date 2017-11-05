package com.example.android.camera2basic.json;

/**
 * Created by Manjusha Chava on 11/4/2017.
 */

public class Contents {

    private String translated;

    private String text;

    private String translation;

    public String getTranslated ()
    {
        return translated;
    }

    public void setTranslated (String translated)
    {
        this.translated = translated;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getTranslation ()
    {
        return translation;
    }

    public void setTranslation (String translation)
    {
        this.translation = translation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [translated = "+translated+", text = "+text+", translation = "+translation+"]";
    }

}
