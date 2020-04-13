package com.example.bandungfood.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Food{
    private String name;
    private String detail;
    private int photo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    /**
     * Cara lain passing data dengan parcelable
     */
    //    public Food() {
//    }
//
//    protected Food(Parcel source){
//        this.name = source.readString();
//        this.detail = source.readString();
//        this.photo = source.readInt();
//
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.name);
//        dest.writeString(this.detail);
//        dest.writeInt(this.photo);
//    }

//    public static final Parcelable.Creator<Food> CREATOR = new Parcelable.Creator<Food>() {
//        @Override
//        public Food createFromParcel(Parcel source) {
//            return new Food(source);
//        }
//
//        @Override
//        public Food[] newArray(int size) {
//            return new Food[size];
//        }
//    };

}
