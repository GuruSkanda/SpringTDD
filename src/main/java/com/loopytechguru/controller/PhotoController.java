package com.loopytechguru.controller;

import com.loopytechguru.model.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    @GetMapping
    public List<Photo> getAllPhotos(){
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo(
                1,
                1,
                "accusamus beatae ad facilis cum similique qui sunt",
                "https://via.placeholder.com/600/92c952",
                "https://via.placeholder.com/150/92c952"
        ));
        photos.add(new Photo(
                2,
                 2,
                "reprehenderit est deserunt velit ipsam",
                "https://via.placeholder.com/600/771796",
                "https://via.placeholder.com/150/771796"
        ));
        photos.add(new Photo(
                3,
                1,
                "officia porro iure quia iusto qui ipsa ut modi",
                "https://via.placeholder.com/600/24f355",
                "https://via.placeholder.com/150/24f355"
        ));
        return photos;
    }
}
