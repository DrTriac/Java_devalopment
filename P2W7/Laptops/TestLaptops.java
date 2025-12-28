package Laptops;

import static Laptops.Brand.*;
import static Laptops.CpuGeneration.*;
import static Laptops.CpuType.*;


public class TestLaptops {
    public static void main(String[] args) {
        int counter = 0;

        Laptops laptops = new Laptops();
        laptops.addLaptop(new Laptop("Kris", IVY_BRIDGE, I7, 16, 256, APPLE));
        counter++;
        laptops.addLaptop(new Laptop("Paulien", HASWELL, I3, 8, 128, TOSHIBA));
        counter++;
        laptops.addLaptop(new Laptop("Kay", BROADWELL, I5, 16, 512, ACER));
        counter++;
        laptops.addLaptop(new Laptop("Divine", KABYLAKE, I5, 32, 1024, DELL));
        counter++;
        laptops.addLaptop(new Laptop("Mohamed", KABYLAKE, null, 16, 512, null));
        counter++;
        System.out.printf("Er zijn %s laptops \n",counter);
        for (int i = 0; i<counter; i++) {
            System.out.printf(laptops.getLaptop(i).toString()+"\n");
        }







}
        }