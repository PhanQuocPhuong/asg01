//Phan Quốc Phương
//Msv : 11020426   K56CD

import java.io.*;
import java.lang.*;

public class Beer{
    public static void main(String[] args){
        System.out.println("THONG TIN CA NHAN");
        System.out.println("Phan Quoc Phuong \t 11020426 \t PhanQuocPhuong \t mrquocphuong@gmail.com");
        for(int i=9;i>=0;i--){
            if(i==0){
                System.out.println("No more bottles of beer on the wall.");
                break;
            }
            System.out.println(+i+" bottles of berr on the wall,"+i+" bottles of beer\nTake one down, pass it round,");
        }
    }
}