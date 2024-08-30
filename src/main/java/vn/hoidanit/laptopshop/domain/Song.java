package vn.hoidanit.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// anotation này sẽ làm cho id auto increment
    private long id;
    private String title;
    private String link;
    private String author;
    private String description;

    @ManyToOne //anotation này để khai báo mối qua hệ)
    @JoinColumn(name = "uploader_id") // anotation này để khai báo khóa ngoại
    private Uploader uploader;

    @OneToMany(mappedBy = "song")
    private List<SongArtist> songArtists;

    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Song [id=" + id + ", title=" + title + ", link=" + link + ", author=" + author + ", description="
                + description + "]";
    }
    public Uploader getUploader() {
        return uploader;
    }
    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }
    public List<SongArtist> getSongArtists() {
        return songArtists;
    }
    public void setSongArtists(List<SongArtist> songArtists) {
        this.songArtists = songArtists;
    }


}
