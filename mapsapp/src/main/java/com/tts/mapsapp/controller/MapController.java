package com.tts.mapsapp.controller;


import com.tts.mapsapp.model.Location;
import com.tts.mapsapp.service.MapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class MapController {


    @Autowired
    MapsService mapsService;

    @GetMapping("/home")
    public String getDefaultMap(){
        Location location = new Location();
        location.setCity("Dallas");
        location.setState("Texas");
        mapsService.addCoordinates(location);
        System.out.println(location);
        return "index";
    }

}
