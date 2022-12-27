
package com.movie.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductionCompany implements Serializable {

    @Expose
    @JsonProperty("id")
    private Long id;
    @JsonProperty("logo_path")
    private String logoPath;
    @Expose
    private String name;
    @JsonProperty("origin_country")
    private String originCountry;

    public Long getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getName() {
        return name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

}
