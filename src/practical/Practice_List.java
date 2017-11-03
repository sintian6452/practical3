/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author B1
 */
public class Practice_List {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
//        scoreList.add(1);
//        scoreList.add(2);
//        scoreList.add(3);
//        scoreList.add(4);
//        scoreList.add(5);
//        scoreList.add(1, 50);
//        scoreList.remove(1);
        
        System.out.print("Please enter your score:");
        int input = sc.nextInt();
        scoreList.add(input);
        
        for (int a = 0; a < scoreList.size(); a++) {
            System.out.println(scoreList.get(a));
        }
        
    }
}
