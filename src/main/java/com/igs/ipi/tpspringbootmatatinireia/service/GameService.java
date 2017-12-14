package com.igs.ipi.tpspringbootmatatinireia.service;

import com.igs.ipi.tpspringbootmatatinireia.model.GameModel;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public GameModel newGame() {
        return new GameModel("Mata", "Lorenzo");
    }
}
