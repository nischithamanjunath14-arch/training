import java.util.*;
public class Student {
    public static void main(String [] args)

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter math marks");
        int m=sc.nextInt();
        System.out.println("enter english marks");
        int e=sc.nextInt();
        System.out.println("enter computer marks");
        int c=sc.nextInt();
        System.out.println("enter social marks");
        int s=sc.nextInt();
        System.out.println("enter kannada marks");
        int k=sc.nextInt();
        double total=m+e+c+s+k;
        System.out.println("total= "+total );
        double per=(total/500)*100;
        System.out.println("percentage= "+per);
        if(per>=75)
            System.out.println("a grade");
        else if(per>=50 && per<75)
            System.out.println("b grade");
        else if(per>=30 && per<50)
            System.out.println("c grade");
        else
            System.out.println("fail");

    }

}
