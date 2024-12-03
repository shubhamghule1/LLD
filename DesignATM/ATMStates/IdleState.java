package com.shubham.LowLevelDesign.DesignATM.ATMStates;

import LowLevelDesign.DesignATM.ATM;
import com.shubham.LowLevelDesign.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
