package Bai_3;

import java.util.Random;

public class RunMain {

    public static void main(String[] args) {
        Random random = new Random();
        Guns A = new Guns("A", 100);
        Guns B = new Guns("B", 100);

        while (true) {
            A.Load(random.nextInt(10) + 1);
            A.Shoot(random.nextInt(10) + 1);

            B.Load(random.nextInt(10) + 1);
            B.Shoot(random.nextInt(10) + 1);

//            System.out.println("Bum: " + A.getAmmoNumber() + " --- " + B.getAmmoNumber());

            if ( A.getAmmoNumber() == 0 && B.getAmmoNumber() == 0) {
                System.out.println("They drew nil-nil");
                break;
            } else if ( A.getAmmoNumber() == 0) {
                System.out.println("B win");
                break;
            } else if ( B.getAmmoNumber() == 0){
                System.out.println("A win");
                break;
            }
        }
    }
}
