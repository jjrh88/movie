
package com.movie.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SpokenLanguage implements Serializable {

    @SerializedName("english_name")
    private String englishName;
    @SerializedName("iso_639_1")
    private String iso6391;
    @Expose
    private String name;

    public String getEnglishName() {
        return englishName;
    }

    public String getIso6391() {
        return iso6391;
    }

    public String getName() {
        return name;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public void setName(String name) {
        this.name = name;
    }
}
