package com.igs.ipi.tpspringbootmatatinireia.controller;

import com.igs.ipi.tpspringbootmatatinireia.component.PartieEnCours;
import com.igs.ipi.tpspringbootmatatinireia.model.GameModel;
import com.igs.ipi.tpspringbootmatatinireia.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;
    @Autowired
    private PartieEnCours partieEnCours;

    private int[][] tableauDonnes = new int[6][7];

    @GetMapping("/new")
    public ModelAndView newGame(){

        GameModel gameModel = gameService.newGame();
        partieEnCours.setGameModel(gameModel);

        ModelAndView mav = new ModelAndView();
        mav.addObject("tab", tableauDonnes);
        mav.addObject("title", "Puissance 4")
                .addObject("body", "Hello world!");
        mav.addObject("gameModel", gameModel);
        mav.setViewName("game");

        return mav;
    }

    @GetMapping
    public ModelAndView continueGame(){

        GameModel gameModel = partieEnCours.getGameModel();

        ModelAndView mav = new ModelAndView();
        mav.addObject("tab", tableauDonnes);
        mav.addObject("title", "Puissance 4")
                .addObject("body", "Hello world!");
        mav.addObject("gameModel", gameModel);
        mav.setViewName("game");

        return mav;
    }

    @GetMapping("/drop/{column}")
    public void ajouteJeton(@PathVariable int column){
        /*foreach(int i : tableauDonnes) {

        }*/
    }
}
