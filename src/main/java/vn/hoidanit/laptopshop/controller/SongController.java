package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String getSongPage() {
        List<Song> songs = songService.getAllSong();
        // System.out.println(songs);
        List<Song> songOfTee = songService.getAllSongByArtist("Justa Tee");
        System.out.println(songOfTee);
        return "song";
    }

    @RequestMapping(value = "/song/post", method=RequestMethod.POST)
    public String createUser(Model model, @ModelAttribute("newSong") Song thisSong) {
        System.out.println("test here " + thisSong);
        songService.handleSetSong(thisSong);
        return null;
    }

    // @RequestMapping
}
