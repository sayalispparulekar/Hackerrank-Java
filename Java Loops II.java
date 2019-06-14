import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum;
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int add = 0;
            int j=0;
            sum = a;
            for(j=0;j<n;j++)
            {
                
                add =  b * (int)Math.pow(2,j);
                sum = sum + add;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

