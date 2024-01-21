package org.bedu.sesion01;

import org.bedu.sesion01.util.GameResult;
import org.bedu.sesion01.util.PlayerInput;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//1 PRUEBA UNITARIA

//AAA
//Arrange - Configuraciones previas o precondiciones
//Act - Ejecucion del codigo a probar
//Assert- verificacion/evaluacion del resultado esperado
public class RockPaperScissorsTest {
    @Test
    public void tieCases() {
        //Act
        //La ejecución del metodo play con parametros iuales
        GameResult result1 = RockPaperScissors.play(PlayerInput.PAPER, PlayerInput.PAPER);
        GameResult result2 = RockPaperScissors.play(PlayerInput.ROCK, PlayerInput.ROCK);
        GameResult result3 = RockPaperScissors.play(PlayerInput.SCISSORS, PlayerInput.SCISSORS);
        //Assert
        // verificar que el resultado sea "TIE"
        assertEquals(result1, GameResult.TIE);
        assertEquals(result2, GameResult.TIE);
        assertEquals(result3, GameResult.TIE);

    }

    @Test
    public void playerOneCases() {
        // Act
        GameResult result1 = RockPaperScissors.play(PlayerInput.ROCK, PlayerInput.SCISSORS);
        GameResult result2 = RockPaperScissors.play(PlayerInput.PAPER, PlayerInput.ROCK);
        GameResult result3 = RockPaperScissors.play(PlayerInput.SCISSORS, PlayerInput.PAPER);

        //Assert
        // Verificar que el resultado sea "PLAYER_ONE_WINS"
        assertEquals(result1, GameResult.PLAYER_ONE_WINS);
        assertEquals(result2, GameResult.PLAYER_ONE_WINS);
        assertEquals(result3, GameResult.PLAYER_ONE_WINS);


    }

    @Test
    public void playerTwoCases() {
        // Act
        GameResult result1 = RockPaperScissors.play(PlayerInput.ROCK, PlayerInput.PAPER);
        GameResult result2 = RockPaperScissors.play(PlayerInput.PAPER, PlayerInput.SCISSORS);
        GameResult result3 = RockPaperScissors.play(PlayerInput.SCISSORS, PlayerInput.ROCK);

        //Assert
        // Verificar que el resultado sea "PLAYER_TWO_WINS"
        assertEquals(result1, GameResult.PLAYER_TWO_WINS);
        assertEquals(result2, GameResult.PLAYER_TWO_WINS);
        assertEquals(result3, GameResult.PLAYER_TWO_WINS);
    }
}