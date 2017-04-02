package com.example.yls.eventbusdemo;



/**
 * Created by 日不落 on 2017/4/2.
 */

public class FirstEvent {

    private String mString;
    public FirstEvent(String string){
        mString = string;
    }

    public String getString(){
        return mString;
    }
}
