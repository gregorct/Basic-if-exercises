// Author: Gregorio Cabrera Tamayo
// Date: 15-10-19
// File: DistinctValues.java

public class DistinctValues{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int num = 0;

        if(a != b && a != c) num++;
        if(b != a && b != c) num++;
        if(c != a && c != b) num++;

        if(num != 0){
            System.out.println(num + " Distinct values");
        }
    }
}