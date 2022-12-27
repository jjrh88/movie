
package com.movie.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MovieDetail implements Serializable {

    @Expose
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;
    @Expose
    private Long budget;
    @Expose
    private List<Genre> genres;
    @Expose
    private String homepage;
    @Expose
    private Long id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @Expose
    private String overview;
    @Expose
    private Double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies;
    @JsonProperty("production_countries")
    private List<ProductionCountry> productionCountries;
    @JsonProperty("release_date")
    private String releaseDate;
    @Expose
    private Long revenue;
    @Expose
    private Long runtime;
    @JsonProperty("spoken_languages")
    private List<SpokenLanguage> spokenLanguages;
    @Expose
    private String status;
    @Expose
    private String tagline;
    @Expose
    private String title;
    @Expose
    private Boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private Long voteCount;



    public String getImdbId() {
        return imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public Double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Long getRuntime() {
        return runtime;
    }

    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getVideo() {
        return video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
