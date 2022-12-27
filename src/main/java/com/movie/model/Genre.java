
package com.movie.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

import java.io.Serializable;


@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Genre implements Serializable {

    @Expose
    private Long id;
    @Expose
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
