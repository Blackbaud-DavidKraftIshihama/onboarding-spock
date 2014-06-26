package com.pingpong;

public class Pingpong {
    public Player playGame(Player player1, Player player2) {
        while (true) {
            if(!player1.hitBall()) return player2;
            if(!player2.hitBall()) return player1;
        }
    }
}
