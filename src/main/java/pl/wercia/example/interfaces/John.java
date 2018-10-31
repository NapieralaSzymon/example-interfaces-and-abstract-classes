package pl.wercia.example.interfaces;

import pl.wercia.example.abstractclasses.Male;

public class John extends Male implements Worker {

    public void work() {
        System.out.println("I need food and rest to work");
    }

}
