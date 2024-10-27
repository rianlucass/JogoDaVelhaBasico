package JogoDaVelha;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        JogoVelha jogoVelha = new JogoVelha("O");

        for (int i = 0; i < 9; i++){
            if (Objects.equals(jogoVelha.jogadorAtual, "O")) {
                jogoVelha.jogadorAtual = "X";
                jogoVelha.mostrarTabuleiro();
                jogoVelha.iniciarJogo();
                jogoVelha.verificarVencedorX();

            } else if (Objects.equals(jogoVelha.jogadorAtual, "X")) {
                jogoVelha.jogadorAtual = "O";
                jogoVelha.mostrarTabuleiro();
                jogoVelha.iniciarJogo();
                jogoVelha.verificarVencedorBola();
            }
        }
    }
}