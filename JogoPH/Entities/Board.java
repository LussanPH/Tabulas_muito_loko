package Entities;
import java.util.List;
import java.util.ArrayList;
public class Board {
    private List<String>[] board;
    @SuppressWarnings("unchecked")
    public Board(){
        board = new ArrayList[40];
    }

    public void addPerson(String cor, int casa){
        board[casa].add(cor);
    }

    public void removePerson(String cor, int casa){
        board[casa].remove(cor);
    }
}
