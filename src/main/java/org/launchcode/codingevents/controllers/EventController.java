package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Taste of St Louis");
        events.add("Lou Fest");
        events.add("Shakespeare in the Park");
        events.add("Turkey Trot");
        model.addAttribute("events", events);

        return "events/index";
    }

}
