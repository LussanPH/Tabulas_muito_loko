import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Board;
import Entities.Persons;
public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        System.out.print("Bem vindo ao JUJUTSU NO CASA BATTLE ROYALE" + "\n digite quantos jogadores participarão: ");
        int k = 0;
        int numero = 0;
        while(k != 1){
            numero = sc.nextInt();
            if(numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6){
                k++;
            }
            else{
                System.err.println("Digite um número válido!");
                System.out.print("digite o número de jogadores: ");
            }
        }
        Persons[] p = new Persons[numero]; /**Vetor com cada elemento sendo as pessoas que estão no jogo */
        sc.nextLine();
        List<String> cores = new ArrayList<>();/**Cria uma lista com as cores do jogo */
        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("azul");
        cores.add("preto");
        cores.add("branco");
        cores.add("marrom");
        for(int i = 0; i<numero; i++){/**Dentro do for inicializa os jogadores e seus atributos */
            String cor = b.selecionarCores(sc, i, cores);
            char type = b.selecionarStatus(p, i, numero);
            p[i] = new Persons(type, 0, cor);
            b.addPerson(p[i].getColor(), 0);
        }
        b.printBoard();
        sc.close();
    }
}   
