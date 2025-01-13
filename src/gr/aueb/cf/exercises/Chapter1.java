package gr.aueb.cf.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Chapter1 {

    public static void main(String[] args) {
        System.out.println("JavaQuest");

        int gold = 20;
        int jewels = 45;
        int sum = gold + jewels;

        System.out.println(sum);

        int totalWeight = 50;
        if (totalWeight < sum) {
            System.out.println("Light Load");
        } else if (totalWeight > sum){
            System.out.println("Heavy Load");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();


        for(int i = 1; i <= 10; i++){
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

     String[] arr = new String[]{"Gold", "Silver", "Diamond", "Ruby"};
     for (int i = arr.length - 1; i >= 0; i--) {
         System.out.println(arr[i]);
     }
        System.out.println();


     String[] treasures = {"Ruby", "Gold", "Diamond", "Silver"};
     Arrays.sort(treasures);
     for (int i =treasures.length - 1; i >= 0; i--) {
         System.out.println(treasures[i]);
     }
        System.out.println();

     for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 5; j++){
         System.out.print("* ");
         }
         System.out.println();
     }
        System.out.println();

     for (int i = 1; i <= 5; i++){
         for (int j = 1; j < i; j++){
             System.out.print(" ");
         }
         System.out.println("*");
     }
        System.out.println();

     for (int i = 1; i <= 5; i++){
         for (int j = i; j < 5; j++){
             System.out.print(" ");
         }
         for (int k = 1; k <= (2 * i - 1); k++){
             System.out.print("*");
         }
         System.out.println();
     }
        System.out.println();


    String[][] treasure = {
            {"Gold", "Silver", "Ruby"},
            {"Emerald", "Diamond", "Sapphire"},
            {"Topaz", "Amethyst", "Opal"}
    };

        for (String[] strings : treasure) {
            for (int k = 0; k < treasure.length; k++) {
                System.out.print(strings[k] + " ");
            }
            System.out.println();
        }
        System.out.println();

        HashMap<String, Integer> treasureMap = new HashMap<>();
        for (int i = 0; i < treasure.length; i++) {
            for (int k = 0; k < treasure[i].length; k++) {
                String currentTreasure = treasure[i][k];
                if (treasureMap.containsKey(currentTreasure)) {
                    treasureMap.put(currentTreasure, treasureMap.get(currentTreasure)+1);
                }else {
                    treasureMap.put(currentTreasure,1);
                }
            }
        }
        System.out.println("Treasure Counts:");
        for (String key : treasureMap.keySet()) {
            System.out.println(key + ": " + treasureMap.get(key));
        }
        System.out.println();


        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
