package Project_Pbo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);
        System.out.println("Karyawan  : ");
        int n = robot.nextInt();

        pastoran[]gerejaKaryawans;
        gerejaKaryawans = new pastoran[n];
        ChoiceMenu choiceMenu = new ChoiceMenu();

        for(int i = 0; i <gerejaKaryawans.length;i++){
            do {
                choiceMenu.userNav();
                n = robot.nextInt();


                if (n == 1 ){
                }
                else if ( n == 2 ) {
                    gerejaKaryawans[i] = new Koster();

                }
                else if(n == 3 ){
                    gerejaKaryawans[i] = new Sekretaris();
                }
                else{
                    System.out.println("Test ");
                };

            }while (n  < 1 || n > 3);
        }
    }
}