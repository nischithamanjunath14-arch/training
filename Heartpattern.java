public class Heartpattern{
    public static void main(String[] args){
        int rows=6;
        int cols=7;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 && j%3!=0){
                    System.out.print("*");
                }else if(i==1 && j%3==0){
                    System.out.print("*");
                }else if(i-j==2){
                    System.out.print("*");
                }else if(i+j==8){
                    System.out.print("*");
                }
                    else{

                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
