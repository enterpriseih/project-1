package com.project.project.controller.demo.threddemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jsy
 * @description: stop
 **/

public class LetOneStop implements Animal.Calltoback {

    @Autowired
    Animal an;

    public LetOneStop(Animal an){
        this.an = an;
    }

    @Override
    public void win() {
        an.stop();
    }
}
