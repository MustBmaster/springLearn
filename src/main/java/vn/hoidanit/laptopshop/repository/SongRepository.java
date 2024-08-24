package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{
    Song save(Song newSong);
    List<Song> findByAuthor(String author);
}
