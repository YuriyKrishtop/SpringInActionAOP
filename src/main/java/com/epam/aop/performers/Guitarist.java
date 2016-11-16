package com.epam.aop.performers;

import com.epam.aop.instrument.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Performer {

    @Autowired
    private Instrument instrument;

    public void perform() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        instrument.play();
    }

    public void say(String word) {
        System.out.println("Guitarist is saying: " + word);
    }
}
