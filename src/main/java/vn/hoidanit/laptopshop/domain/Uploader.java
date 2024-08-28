package vn.hoidanit.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Uploader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    // 1 uploader có thể up nhiều song
    @OneToMany(mappedBy = "uploader")//anotation này khai báo mối quan hệ và trường map tới (ở bên song đã khai báo 1 thuộc tính uploader)
    private List<Song> songs; //thuộc tính này thể hiện 1 uploader có thể có nhiều song


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Uploader [id=" + id + ", name=" + name + ", description=" + description + "]";
    }


}
