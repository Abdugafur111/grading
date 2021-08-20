import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        int numberOfScores = scan.nextInt();
        int[] scores = new int[numberOfScores];

        for(int i=0; i<numberOfScores; i++){
            scores[i] = scan.nextInt();
        }

        getGrades(scores);


        }





        public static int max(int[] scores){
        int max = scores[0];
        for(int i=0; i <scores.length; i++){
            if(max<scores[i])
                max = scores[i];
        }
        return max;
        }

        public static void getGrades(int[] scores){
        for(int i =0; i<scores.length; i++){
            if(scores[i]>=max(scores)-10){
                System.out.println(i + " A");
            }
            else if(scores[i]>=max(scores)-20){
                System.out.println(i + " B");}
            else if(scores[i]>=max(scores)-30) {
                System.out.println(i + " C");
            }
            else if(scores[i]>=max(scores)-40) {
                System.out.println(i + " D");
            }
            else
                System.out.println("F");
        }

        }



}
