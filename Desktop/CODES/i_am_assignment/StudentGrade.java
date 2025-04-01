import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	ArrayList<ArrayList<Double>> studentScores = new ArrayList<>();
	
	System.out.println ("HOW MANY STUDENT DO YOU HAVE?");
	int studentSize = input.nextInt();
	
	System.out.println ("HOW MANY SUBJECT DO YOU OFFER?");
	int subjectSize = input.nextInt();
	
	System.out.println ("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println ("Saved successfully");
	System.out.println();
	
	int passes = 0;
	int fails = 0;
	int limit = 50;
	double averageScore = 0;
	int max = 0;
	int min = 0;
	double score = 0;
	
	for (int count = 0; count < studentSize; count++) {
            ArrayList<Double> scores = new ArrayList<>();

            for (int count2 = 0; count2 < subjectSize; count2++) {
				System.out.println("ENTER SCORES FOR STUDENT " + (count + 1));
				System.out.println("ENTER SCORE FOR SUBJECT " + (count2 + 1) + ": ");
                		score = input.nextInt(); 
				System.out.println ("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println ("Saved successfully");
				System.out.println();
			
			scores.add(score);
				
            studentScores.add(scores);
            System.out.println();

				if(score >= limit) {
					passes++;
				} else if (score < limit) {
					fails++;
				}
			}
	}			
		

		for (int row = 0; row < studentSize; row++) {
            System.out.print("Student " + (row + 1) + ": ");
            for (int col = 0; col < subjectSize; col++) {
                System.out.print(ArrayList<Double>> studentScores[row][col] + "    ");
            }
            System.out.println();
	}
				
			averageScore = score + score / subjectSize;
		
			System.out.println("AVERAGE SCORE:" + averageScore);
			System.out.println("NUMBER OF PASSES: " + passes);
			System.out.println("NUMBER OF FAILS: " + fails);
			System.out.println();
			
}
}