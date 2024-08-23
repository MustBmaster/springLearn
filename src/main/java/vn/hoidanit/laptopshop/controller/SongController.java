package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.Song;


@Controller
public class SongController {
    @RequestMapping("/song")
    public String getSongPage(Model model) {
        model.addAttribute("newSong", new Song() );
        return "song";
    }
    @RequestMapping(value = "/song/post", method=RequestMethod.POST)
    public String createUser(Model model, @ModelAttribute("newSong") Song thisSong) {
        System.out.println("test here" + thisSong);
        return null;
    }
    
}
