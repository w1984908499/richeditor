package com.lu.lubottommenu.theme;

import android.os.Parcel;

import com.lu.lubottommenu.api.ITheme;

/**
 * Created by 陆正威 on 2017/9/17.
 */

public abstract class AbstractTheme implements ITheme{
    @Override
    public abstract int[] getBackGroundColors() ;

    @Override
    public abstract int getAccentColor();

    @Override
    public abstract int getNormalColor();

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    protected AbstractTheme(Parcel in) {

    }

}