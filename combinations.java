package com.combination;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    int n,r,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter n Number:");
        n = input.nextInt();
        System.out.println("Please enter r number");
        r = input.nextInt();
        System.out.println("The result of the combination you entered:"+comb(n,r));
    }
    static int comb(int n, int r){
        return perm(n)/(perm(r) * perm(n-r));
    }
    static int perm(int i){
        if(i==1){
            return 1;
        }
        return i*perm(i-1);
    }
}
