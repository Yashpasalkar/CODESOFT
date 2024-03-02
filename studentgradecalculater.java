import java.util.*;
public class studentgradecalculater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subject's marks");
        System.out.println("Science marks:");
        int m1=sc.nextInt();
        System.out.println("Maths marks:");
        int m2=sc.nextInt();
        System.out.println(" Social Science marks:");
        int m3=sc.nextInt();
        System.out.println("English marks:");
        int m4=sc.nextInt();
        System.out.println("Hindi marks:");
        int m5=sc.nextInt();
        int tot=m1+m2+m3+m4+m5;
        float per=tot/5;
        System.out.println("The total number of marks obtained by student is: "+ tot);
        System.out.println("The percentage of Student is : "+ per);
        if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
    }

    
}
