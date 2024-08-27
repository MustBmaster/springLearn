package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.Song;
import vn.hoidanit.laptopshop.repository.SongRepository;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song handleSetSong(Song song) {
        return this.songRepository.save(song);
    }

    public List<Song> getAllSong() {
        return this.songRepository.findAll();
    }

    public List<Song> getAllSongByArtist(String author) {
        return this.songRepository.findByAuthor(author);
    }

    public Song getSongById(long id) {
        return this.songRepository.findById(id);
    }

    public void deleteSongById(long id) {
        this.songRepository.deleteById(id);
    }
}
