package com.example.android.camera2basic.json;

/**
 * Created by Manjusha Chava on 11/4/2017.
 */

public class TwitchAPI {

    private Contents contents;

    public Contents getContents ()
    {
        return contents;
    }

    public void setContents (Contents contents)
    {
        this.contents = contents;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contents = "+contents+"]";
    }

}
