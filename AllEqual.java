// Author: Gregorio Cabrera Tamayo
// Date: 15-10-19
// File: AllEqual.java

public class AllEqual{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(a!=b){
            System.out.println("not all equal");
        }else{
            System.out.println("all equal");
        }
    }
}