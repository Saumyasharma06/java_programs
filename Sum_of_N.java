import java.util.Scanner;

public class Sum_of_N {
    public static void main(String args[]){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
       sum+=i;
    }
    System.out.println(sum);
    sc.close();
} 
    
}
