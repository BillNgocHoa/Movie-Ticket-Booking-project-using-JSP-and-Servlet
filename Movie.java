/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.techtutorial.ctb.admin.model;

/**
 *
 * @author nnbil
 */
public class Movie {
    private int id;
    private String name;
    private String director;
    private String description;
    private String releaseDate;
    private String casts;
    private String posterName;
    private String trailerLink;
    private String duration;
    private String categoryID;

    
    public Movie() {
    }
    
    
    public Movie(int id, String name, String director, String description, String releaseDate, String casts, String posterName, String trailerLink, String duration, String categoryID) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.description = description;
        this.releaseDate = releaseDate;
        this.casts = casts;
        this.posterName = posterName;
        this.trailerLink = trailerLink;
        this.duration = duration;
        this.categoryID = categoryID;
    }

    public Movie(String name, String director, String description, String releaseDate, String casts, String posterName, String trailerLink, String duration, String categoryID) {
        this.name = name;
        this.director = director;
        this.description = description;
        this.releaseDate = releaseDate;
        this.casts = casts;
        this.posterName = posterName;
        this.trailerLink = trailerLink;
        this.duration = duration;
        this.categoryID = categoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", director=" + director + ", description=" + description + ", releaseDate=" + releaseDate + ", casts=" + casts + ", posterName=" + posterName + ", trailerLink=" + trailerLink + ", duration=" + duration + ", categoryID=" + categoryID + '}';
    }
  
    
    
}
