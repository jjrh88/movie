
package com.movie.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductionCountry implements Serializable {

    @SerializedName("iso_3166_1")
    private String iso31661;
    @Expose
    private String name;

    public String getIso31661() {
        return iso31661;
    }

    public String getName() {
        return name;
    }

    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
    }

    public void setName(String name) {
        this.name = name;
    }

}
