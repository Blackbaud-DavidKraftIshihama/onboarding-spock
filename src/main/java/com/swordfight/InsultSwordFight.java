package com.swordfight;

/**
 *
 * Insult your enemy to throw them off their guard! A sufficient insult
 * will let you get stabby.
 *
 **/
public class InsultSwordFight {

    private InsultJudge insultJudge;

    public InsultSwordFight(InsultJudge insultJudge) {
        this.insultJudge = insultJudge;
    }

    /**
     *
     * Duke it out! Two players insult each other, the winner stabs the other and is returned!
     *
     **/
    public Fighter fight(Fighter fighter1, Fighter fighter2) {
        String insult1 = fighter1.getInsult();
        String insult2 = fighter2.getInsult();
        String winningInsult = insultJudge.judgeInsults(insult1, insult2);
        if (winningInsult.equals(insult1)) {
            fighter1.stab(fighter2);
            return fighter1;
        } else {
            fighter2.stab(fighter1);
            return fighter2;
        }
    }
}
