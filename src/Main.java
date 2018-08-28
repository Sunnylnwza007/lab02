import java.util.*;
public class Main {

    public static void main(String[] args) {
        int row, col;
        Scanner a = new Scanner (System.in);
        ClassOx ox = new ClassOx();
        while (ox.getround()<10) {
            ox.GetTable();
            System.out.println(ox.CurPlayer() + " row: ");
            row = a.nextInt();
            System.out.println(ox.CurPlayer() + " col: ");
            col = a.nextInt();
            ox.input(row,col);
            if (ox.CheckWinOrDraw(row,col)){
                break;
            }
        }
        ox.show();
    }
}