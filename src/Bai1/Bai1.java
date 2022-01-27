/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Bai1 {
    
    private static void cau1(int n){
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println("S(" + n + ") = " + s);
    }
    
    private static void cau2(int x){
        double s = 0;
        for (int i = 3; i <= 2*x + 1; i += 2) {
            s = s + 1.0/i; 
        }
        System.out.println("f(" + x + ") = " + s);
    }
    
    public static void main(String[] args) {
        cau1(50);
        cau1(80);
        cau1(99);
        
        cau2(10);
        cau2(20);
        cau2(50);
    }
}
