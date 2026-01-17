package Cache;

import java.lang.reflect.Array;

public class TestCache {
    public static void main(String[] args) {

        int counter = 0;
        Car[] cars = new Car[3];
        Car clio = new Car("renault", "clio", TireSizeFactory.create(185, 65, 15));
        cars[counter] = clio;
        Car sandero = new Car("dacia", "sandero", new TireSize(185, 65, 15));
        cars[counter++] = sandero;
        Car bmw = new Car("bmw", "4 serie", new TireSize(225, 35, 20));
        cars[counter++] = bmw;
        Car c3 = new Car("citroen", "c3", new TireSize(185, 65, 15));
        cars[counter++] = c3;

        for(Car c : cars)
        {
            System.out.println(c);
        }


    }
}
