// https://www.geeksforgeeks.org/coin-game-winner-every-player-three-choices
// Not Completed

public class CoinGame {
    public static char coinGame(int n, int x, int y) {
        if(n == 1) {
            return 'A';
        } else if(n == 2) {
            return 'B';
        }

        

        return 'X';
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 3;
        int y = 4;

        System.out.println(coinGame(n, x, y));
    }
}