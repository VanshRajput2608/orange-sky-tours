package com.orangeskytours.controller;

import com.orangeskytours.model.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Tour> tours = Arrays.asList(
            new Tour("Goa Getaway", 3, 2, 9999, "goa.jpg"),
            new Tour("Kashmir Paradise", 5, 4, 14999, "kashmir.jpg"),
            new Tour("Paris Explorer", 6, 5, 75999, "paris.jpg"),
            new Tour("Dubai Adventure", 4, 3, 45999, "dubai.jpg"),
            new Tour("Maldives Honeymoon", 5, 4, 99999, "maldives.jpg"),
            new Tour("Bali Delight", 5, 4, 69999, "bali.jpg"),
            new Tour("Rajasthan Royal Tour", 6, 5, 12999, "rajasthan.jpg"),
            new Tour("Thailand Fun Trip", 4, 3, 35999, "thailand.jpg"),
            new Tour("Singapore City Tour", 3, 2, 40999, "singapore.jpg"),
            new Tour("Manali Snow Tour", 4, 3, 8999, "manali.jpg"),
            new Tour("Leh Ladakh Adventure", 6, 5, 15999, "leh.jpg"),
            new Tour("Andaman Beach Trip", 5, 4, 21999, "andaman.jpg"),
            new Tour("Europe Grand Tour", 10, 9, 149999, "europe.jpg"),
            new Tour("Jaipur Heritage Trip", 2, 1, 5999, "jaipur.jpg"),
            new Tour("Kerala Backwaters", 4, 3, 10999, "kerala.jpg"),
            new Tour("Nepal Escape", 3, 2, 9999, "nepal.jpg"),
            new Tour("Sri Lanka Wonders", 5, 4, 42999, "srilanka.jpg"),
            new Tour("Switzerland Bliss", 6, 5, 99999, "switzerland.jpg"),
            new Tour("London Tour", 5, 4, 85999, "london.jpg"),
            new Tour("Mauritius Relaxation", 6, 5, 92999, "mauritius.jpg")
        );
        model.addAttribute("tours", tours);
        return "index";
    }
}