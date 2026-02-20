import java.sql.SQLOutput;

public class CallByValue {
    int[] swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }

    static void main(String[] args) {
        int a=10;
        int b=40;
        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);
        System.out.println("After swapping");
        CallByValue c=new CallByValue();
        int[] result =c.swap(a,b);
        a=result[0];
        b=result[1];
        System.out.println(a);
        System.out.println(b);
    }
}
