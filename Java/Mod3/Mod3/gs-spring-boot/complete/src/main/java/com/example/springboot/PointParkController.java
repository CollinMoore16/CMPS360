package com.example.springboot;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointParkController {
    @RequestMapping("/point")
    public String point() {
        return "welcome to Bison Country";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is a story about a man not named Brady";
    }

    @RequestMapping("/home")
    public String home() {
        return "201 wood street is my home";
    }

    public String birthday() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Check if it's January 31st
        if (currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 31) {
            return "Happy Birthday!";
        } else {
            return "It is not your birthday.";
        }
    }
}
