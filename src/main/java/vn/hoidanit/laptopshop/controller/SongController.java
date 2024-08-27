package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.Song;
import vn.hoidanit.laptopshop.service.SongService;

@Controller
public class SongController {
    // khai báo repository
    private final SongService songService;

    // constructor
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/song")
    public void getSongPage() {
        List<Song> songs = songService.getAllSong();
        // System.out.println(songs);
        List<Song> songOfTee = songService.getAllSongByArtist("Justa Tee");
        System.out.println(songOfTee);
        // return "song";
    }

    @RequestMapping(value = "/song/post", method = RequestMethod.POST)
    public void createSong(Song thisSong) {
        System.out.println("test here " + thisSong);
        songService.handleSetSong(thisSong);
        // return null;
    }

    @PostMapping("/song/update")
    public void updateSong(Song song) {
        // TODO: process POST request
        Song thisSong = this.songService.getSongByID(song.getId());
        if (thisSong != null) {
            thisSong.setTitle(song.getTitle());
            thisSong.setLink(song.getLink());
            thisSong.setAuthor(song.getAuthor());
            thisSong.setDescription(song.getDescription());
            //lưu ý: đối với springboot sẽ có hàm save trong thư viện JpaRepository là insert or update
            //nên ở dưới đây dùng chung handleSetSong
            this.songService.handleSetSong(thisSong);
        }
        // return null;
    }


}
