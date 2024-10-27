package JogoDaVelha;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class JogoVelha {
    String[][] tabuleiro = new String[3][3];
    String jogadorAtual;

    Scanner scanner = new Scanner(System.in);

    public JogoVelha(String jogadorAtual) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = " ";
            }
        }
        this.jogadorAtual = jogadorAtual;
    }

    void mostrarTabuleiro() {

        System.out.println("    0   1   2");
        System.out.println("      |   |    ");
        System.out.println("0   "+ tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println("  ----|---|----");
        System.out.println("1   "+ tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println("  ----|---|----");
        System.out.println("2   "+ tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
        System.out.println("      |   |    ");

    }

    void iniciarJogo() {

        if (Objects.equals(jogadorAtual, "O")) {
            System.out.print("\nJogador " + jogadorAtual + "! Insira a posição Linha e Coluna respectivamente:");
            int posicaoX = scanner.nextInt();
            int posicaoY = scanner.nextInt();

            if (Objects.equals(tabuleiro[posicaoX][posicaoY], " ")) {
                tabuleiro[posicaoX][posicaoY] = "O";
            } else {
                System.out.println("JOGADA INVALIDA! tente novamente...");
                System.out.print("\nJogador " + jogadorAtual + "! Insira a posição Linha e Coluna respectivamente:");
                posicaoX = scanner.nextInt();
                posicaoY = scanner.nextInt();
                if (Objects.equals(tabuleiro[posicaoX][posicaoY], " ")) {
                    tabuleiro[posicaoX][posicaoY] = "O";
                } else {
                    System.out.println("Perdeu a Vez!");
                }
            }

        } else {
            System.out.print("Jogador " + jogadorAtual + "! Insira a posição Linha e Coluna respectivamente:");
            int posicaoX = scanner.nextInt();
            int posicaoY = scanner.nextInt();

            if (Objects.equals(tabuleiro[posicaoX][posicaoY], " ")) {
                tabuleiro[posicaoX][posicaoY] = "X";
            } else {
                System.out.println("JOGADA INVALIDA! tente novamente...");
                System.out.print("Jogador " + jogadorAtual + "! Insira a posição Linha e Coluna respectivamente:");
                posicaoX = scanner.nextInt();
                posicaoY = scanner.nextInt();
                if (Objects.equals(tabuleiro[posicaoX][posicaoY], " ")) {
                    tabuleiro[posicaoX][posicaoY] = "X";
                } else {
                    System.out.println("Perdeu a Vez!");
                }
            }
        }
    }

    void verificarVencedorBola() {

        //combinações horizontais
        if (tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("0") && tabuleiro[0][2].equals("0")) {
            System.out.println("Jogador O venceu!!!");
        } else if (tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("0") && tabuleiro[1][2].equals("0")) {
            System.out.println("Jogador O venceu!!!");
        } else if (tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("0") && tabuleiro[2][2].equals("0")) {
            System.out.println("JOgador O venceu!!!");

        //combinações em colunas
        } else if (tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O")) {
            System.out.println("Jogador O venceu!!!");
        } else if (tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O")) {
            System.out.println("Jogador O venceu!!!");
        } else if (tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O")) {
            System.out.println("Jogador O venceu!!!");

        //combinações em diagonais
        } else if (tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O")) {
            System.out.println("Jogador O venceu!!!");
        } else if (tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O")) {
            System.out.println("Jogador O venceu!!!");
        }
    }

    void verificarVencedorX() {
        if (tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        } else if (tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        } else if (tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X")) {
            System.out.println("Jogador X venceu!!!");

            //combinações em colunas
        } else if (tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        } else if (tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        } else if (tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X")) {
            System.out.println("Jogador X venceu!!!");

            //combinações em diagonais
        } else if (tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        } else if (tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X")) {
            System.out.println("Jogador X venceu!!!");
        }
    }

}