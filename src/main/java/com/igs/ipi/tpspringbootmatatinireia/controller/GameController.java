package com.igs.ipi.tpspringbootmatatinireia.controller;

import com.igs.ipi.tpspringbootmatatinireia.model.GameModel;
import com.igs.ipi.tpspringbootmatatinireia.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/new")
    public ModelAndView newGame(){

        GameModel gameModel = gameService.newGame();
        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "Puissance 4")
                .addObject("body", "Hello world!");
        mav.addObject("gameModel", gameModel);
        mav.setViewName("game");

        return mav;
    }
}
