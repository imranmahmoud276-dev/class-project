import java.util.Scanner;

public class HighLow{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.println("ENTER SCORE");
		int score= Kb.nextInt();
		if(score>90){
			System.out.println("A+");
			
		else if(score>80)
 			System.out.println("A");
        else if(score>70)
            System.out.println("B+");

        else if(score>60)
 			System.out.println("B");
        else if(score>50)
            System.out.println("C+");
        else if(score>40)
 			System.out.println("C-");
        else
            System.out.println("FAIL");



	
	}


}