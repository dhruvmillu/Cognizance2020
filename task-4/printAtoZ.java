 import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows you want");
        int j = s.nextInt();
        String c ="";
                for(int k=j;k>0;){
                    //if(k%26!=0){
                    c=(char)(((k-1)%26)+65)+c;
                    if(k%26==0){k=k/26-1;}
                    else{k=k/26;}
                }
                System.out.println(c);
    }
    
}
