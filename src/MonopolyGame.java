public class MonopolyGame {
    private int roundCat;
    private Board board;
    private Die[] dices;
    private Player[] players;
    private static int N;

    public MonopolyGame(int numOfPlayer) {
        this(numOfPlayer,20);
    }
    public MonopolyGame
            (int numOfPlayer,int numRound){
        this(numOfPlayer,numRound,40);
    }
    public MonopolyGame(int numOfPlayer, int numRound, int numSquares){
        this(numOfPlayer,numRound,numSquares,2);
    }

    public MonopolyGame(int numOfPlayer, int numRound, int numSquares, int numDices){
        dices = new Die[numDices];
        players = new Player[numOfPlayer];
        board = new Board(numSquares);
        initDices();
        N = numRound;
        roundCat = 0;
        initPlayer(numOfPlayer);
    }



    public void initPlayer(int numPlayer){
        for(int i = 0 ; i < numPlayer ; i++){
            players[i] = new Player("Player "+(i+1),dices,board);
        }
    }
    public void initDices(){
        int numDices = dices.length;
        for(int i = 0 ; i < numDices ; i++){
            dices[i] = new Die();
        }
    }

    public void playGame(){
        for ( ; roundCat < N ; roundCat++ ){
            System.out.println("Round : " + (roundCat+1));
            playRound();
        }

    }

    private void playRound(){
        int numOfPlayer = players.length;
        for(int i = 0 ; i < numOfPlayer ; i++ ){

            System.out.printf("%s => ",players[i].getName());
            players[i].takeTurn();
        }
        System.out.println();

    }
}
