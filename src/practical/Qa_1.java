
package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Qa_1 {

    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>();
               
        //user add score
        scoreList = addScore(scoreList);
        
        //display all score
        for(int i =0; i< scoreList.size(); i++){
            System.out.println(scoreList.get(i));
        }
        
        //find high score & low score
        int lowScore = scoreList.get(0);
        int highScore = scoreList.get(0);
        for (int value: scoreList) {
            if (value > lowScore) {
              lowScore = value;
            }
            if(value < highScore)
              highScore = value;
        }
        System.out.println(lowScore);
        System.out.println(highScore);
        
        //average score
        double average = 0;
        int totalScore=0;
        for(int a = 0; a < scoreList.size(); a++){
             totalScore += scoreList.get(a);
        }
        average = totalScore/scoreList.size();
        System.out.println(average);
    
}
    public static List addScore(List scoreList){
        Scanner sc = new Scanner(System.in);
        String response ="";
        do{
            System.out.print("Please enter your score: ");
            int input = sc.nextInt();
            scoreList.add(input);
            System.out.print("Do you want continue? Y/N ");
            response = sc.next();
            
        }while(response.equals("y") || response.equals("Y"));
        return scoreList;
    }
}
