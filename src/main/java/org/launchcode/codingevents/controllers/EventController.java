package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
//        List<String> events = new ArrayList<>();
//        events.add("Taste of St Louis");
//        events.add("Lou Fest");
//        events.add("Shakespeare in the Park");
//        events.add("Turkey Trot");

        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "create";
        //note: previous line, Chris had path = events/create and I got an error??
    }

    @PostMapping("create")
    public String createEvents(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";

    }
}
