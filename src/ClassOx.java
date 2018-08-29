public class ClassOx {
    private String [][] table = new String[3][3];
    private String player = "X";
    private int countRound = 1;
    private int countX = 0;
    private int countO = 0;
    private int countDraw = 0;

    ClassOx() {
        SetTable();
    }

    public int getCountX(){ return countX; }
    public int getCountO(){ return countO; }
    public int getCountDraw(){ return countDraw; }

    public int getround(){
        return countRound;
    }

    public void SetTable(){
        countRound = 1;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                table[i][j] = "-";
            }
        }
    }

    public void GetTable(){
        System.out.println(" 0 1 2 ");
        for (int i = 0;i<3;i++) {
            System.out.print(i+" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean CheckWinner(int row,int col){
        if (table[row][0].equals(table[row][1])
                && table[row][0].equals(table[row][2])
                && !table[row][0].equals("-")
                || (table[0][col].equals(table[1][col])
                && table[0][col].equals(table[2][col])
                && !table[0][col].equals("-") )
                || (table[0][0].equals(table[1][1])
                && table[0][0].equals(table[2][2])
                && !table[0][0].equals("-"))
                || (table[0][2].equals(table[1][1])
                && table[0][2].equals(table[2][0])
                && !table[0][2].equals("-"))){
            return true;
        }else {
            return  false;
        }
    }

    public boolean CheckWinOrDraw(int row,int col) {
        if (row>=0 && row<3 && col>=0 && col<3) {
            if (CheckWinner(row, col)) {
                return true;
            } else if (countRound > 9) {
                countDraw++;
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public String CurPlayer(){
        return player;
    }

    public void change(){
        if (player.equals("X")){
            player = "O";
        }else{
            player = "X";
        }
    }

    public void input(int row,int col){
        if (row>=0 && row<3 && col>=0 && col<3){
            if (table[row][col].equals("-") ){
                    table[row][col] = player;
                    if (CheckWinner(row,col)){
                        if (player.equals("X")){
                            countX++;
                        }else if (player.equals("O")){
                            countO++;
                        }
                    }
                    change();
                    countRound++;
            }
        }
    }

    public void show(){
        if (countDraw==0){
            System.out.println("X win "+countX);
            System.out.println("O win "+countO);
            System.out.println("Draw " +countDraw);
        }else {
            GetTable();
            System.out.println("X win "+countX);
            System.out.println("O win "+countO);
            System.out.println("Draw " +countDraw);
        }
    }
}