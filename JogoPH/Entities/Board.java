package Entities;
import java.util.List;
import java.util.ArrayList;
public class Board {
    private List<String>[] board;/**Cria um vetor de listas do tipo String */
    @SuppressWarnings("unchecked")/**Feito para suspender avisos de erros */
    public Board(){
        board = new ArrayList[40];
        for(int i = 0; i<40; i++){
            board[i] = new ArrayList<>();/**Instancia cada elemento do vetor para não serem valores nulos */
        }
    }
    
    public List<String>[] getBoard() {/**get e set*/
        return board;
    }
    public void setBoard(List<String>[] board) {
        this.board = board;
    }

    public void printBoard(){/**Printa o tabuleiro */
        for(int i = 0; i<40; i++){
            System.out.println(board[i]);
        }
    }

    public void addPerson(String cor, int casa){/**Adiciona uma peça em uma casa específica */
        board[casa].add(cor);
    }

    public void removePerson(String cor, int casa){/**Remove uma peça em uma casa específica */
        board[casa].remove(cor);
    }
}
