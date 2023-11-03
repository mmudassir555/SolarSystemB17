package SolarSystem;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys= new solarSystemBasics();
        solarsys.sun="1";
        solarsys.Moon="10";
        solarsys.planets="12";
        solarsys.Star="15";


        // feature Sun

        featureSon sun = new featureSon();
        sun.name = "Panther";
        sun.temp = "3433";
        sun.color = "Black";



        // planet1
        planet1 ploto = new planet1();
        ploto.name = "Green";
        ploto.temp= "Cool";
        ploto.color= "kuch b";
        ploto.radius = "334234234";

    }

}
