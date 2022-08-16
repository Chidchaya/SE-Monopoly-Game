public class Board {
    private int numSquares;
    private Square[] squares;

    public Board(int num){
        this.numSquares = num;
        squares = new Square[num];
        for(int i = 0 ; i < num ; i++){
            squares[i] = new Square();
            squares[i].setName(""+i);
        }
    }

    public Square getInitSquare(){
        return squares[0];
    }
    public Square getSquare(Square oldLocation, int faceValues){ //โลเคชั่นที่เปลี่ยน จะต้องผันตามลูกเต๋าที่ทอย
        int oldLocationInt = Integer.parseInt(oldLocation.getName());
        int newLocationInt = (oldLocationInt) + faceValues;
        if(newLocationInt > numSquares - 1){
            newLocationInt = Math.abs(newLocationInt - numSquares);
        }
        return squares[newLocationInt];
    }
}
