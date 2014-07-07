package com.swordfight;

/**
 *
 * Throw insults at your enemy to throw them off their guard! A sufficient insult
 * will let you get stabby.
 *
 **/
public class InsultSwordFight {

    /**
     *
     * Duke it out! Two players insult each other, the winner stabs the other and is returned!
     *
     **/
    public Fighter fight(InsultJudge insultJudge, Fighter fighter1, Fighter fighter2) {
        int winningPlayer = insultJudge.judgeInsult(fighter1.getInsult(), fighter2.getInsult());
        if (winningPlayer == 1) {
            fighter1.stab(fighter2);
            return fighter1;
        } else {
            fighter2.stab(fighter1);
            return fighter2;
        }
    }
}
