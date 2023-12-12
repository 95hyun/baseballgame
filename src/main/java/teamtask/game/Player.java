package teamtask.game;

import java.util.Scanner;

public class Player {
    // 3자리 숫자 ->


    // 필드
    int choiceNum;



    // 메서드
    public int Choice () {
        Scanner scan = new Scanner(System.in);
        int choiceNum = scan.nextInt();
        return choiceNum;
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.Choice();
    }
}
