 import java.util.*;
public class name_shortner {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String a = s.nextLine();
        int k,l=0;
        k= a.lastIndexOf(" ");
        String res= "";
        for(int i=0;i<=k;i++){
            char c= a.charAt(i);
            if(c==' '){
                res=res+a.charAt(l)+". ";
                l=i+1;
            }
        }
       res=res+a.substring(k+1);
        System.out.println(res);
    }
    
}
