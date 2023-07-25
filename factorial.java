import java.util.Scanner;

class factorial
{
    public static void main(String[] args) {
        int num;
        int fact=1;
        System.out.print("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            num=sc.nextInt();
        }
        while(num!=0)
        {
            fact = fact*num;
            num--;
        }
        System.out.println("Factorial:: "+fact);
    }
}
