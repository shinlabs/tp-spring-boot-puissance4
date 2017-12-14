package com.igs.ipi.tpspringbootmatatinireia.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    @GetMapping("/new")
    public ModelAndView newGame(){

        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "Puissance 4")
                .addObject("body", "Hello world!");
        mav.setViewName("game");
        return mav;

//        ModelAndView mav = new ModelAndView("game");
//        return mav;
    }
}
