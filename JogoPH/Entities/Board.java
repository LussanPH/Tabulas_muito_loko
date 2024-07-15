import java.util.Scanner;
import Entities.Board;
import Entities.Persons;
import java.util.List;
import java.util.ArrayList;
public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        List<String> cores = new ArrayList<>();
        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("azul");
        cores.add("preto");
        cores.add("branco");
        cores.add("marrom");
        System.out.print("Bem vindo ao JUJUTSU NO CASA BATTLE ROYALE" + "\n digite quantos jogadores participarão: ");
        int numero = sc.nextInt();
        Persons[] p = new Persons[numero]; /**Vetor com cada elemento sendo as pessoas que estão no jogo */
        sc.nextLine();
        for(int i = 0; i<numero; i++){
            System.out.print("Jogador " + 0 + (i+1) + " digite uma das cores disponíveis");/**Seleção das cores */
            System.out.print(cores + ": ");
            String c = sc.nextLine();
            p[i].setCor(c);
            cores.remove(c);
        }
        
        sc.close();
    }
}   
