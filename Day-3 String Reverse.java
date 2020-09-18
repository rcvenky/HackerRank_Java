import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        //System.out.println((a.equals(new StringBuilder(a).reverse().toString()))?"Yes":"No"));
        StringBuilder A = new StringBuilder();
        A.append(a);
        String b =new String(A.reverse());
        if(a.equals(b))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
