import java.util.Scanner;
import Entities.Board;
import Entities.Persons;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;/**Dicionario em java */
import java.util.TreeMap;/** || */
public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        Map<String, Integer> dicionario = new TreeMap<>();
        dicionario.put("azarado", 0);/**                                              */
        dicionario.put("sortudo", 1);/** Dicionario para os status retornarem inteiros*/
        dicionario.put("normal", 2);/**                                               */
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
        for(int i = 0; i<numero; i++){/**Dentro do for inicializa os jogadores e seus atributos */
            selecionarCores(cores, p, sc, i);
            selecionarStatus(dicionario, p, sc, i, numero);
            b.addPerson(p[i].getCor(), 0);
        }
        b.printBoard();
        sc.close();
    }

    public static void selecionarCores(List<String> cores, Persons[] p, Scanner sc, int i){/**Seleção das cores */
        p[i] = new Persons(null, 0, 0, -1);
        System.out.println("JOGADOR " + 0 + (i+1));
        System.out.print("digite uma das cores disponíveis");
        System.out.print(cores + ": ");
        String c = sc.next();
        p[i].setCor(c);
        cores.remove(c);
    }

    public static void selecionarStatus(Map<String, Integer> dicionario, Persons[] p, Scanner sc, int i, int numero){/**Seleção dos status iniciais */
        if(i < numero && i != numero - 1){/**aqui os primeiros jogadores selecionam qualquer um do 3 status */
            System.out.print("digite um dos status disponíveis[azarado, sortudo, normal]: ");
        }
        else{/**Aqui o último jogador a escolher, dependendo das escolhas dos outros jogadores, vai ter ou não opções limitadas */
            int count = 0;
            int j = 1;
                while(p[j].getStatus() != -1){
                    if(p[j].getStatus() == p[j-1].getStatus()){
                        count++;
                    }
                    j++;
                }
                if(count == numero - 2){
                    if(p[0].getStatus() == 0){
                        System.out.print("digite um dos status disponíveis[sortudo, normal]: ");
                    }
                    else if(p[0].getStatus() == 1){
                        System.out.print("digite um dos status disponíveis[azarado, normal]: ");      
                    }
                    else{
                        System.out.print("digite um dos status disponíveis[azarado, sortudo]: ");
                    }
                }
                else{
                    System.out.print("digite um dos status disponíveis[azarado, sortudo, normal]: ");
                }
        }
        int x = dicionario.get(sc.next());
        p[i].setStatus(x);
    }
}   
