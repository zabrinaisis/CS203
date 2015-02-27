/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d4;

/**
 *
 * @author ZBrodale
 */
public class TestComparison {
    public static void main(String[] args) {
        byte b = 5;
        short s = 5;
        int i = 5;
        long L= 5;
        float f = 5.0f;
        double d = 5.0;
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
        
        boolean a = false;
        boolean c = false;
        boolean e = false;
        boolean g = false;
        boolean h = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        boolean m = false;
        boolean n = false;
        boolean o = false;
        boolean p = false;
        boolean q = false;
        boolean r = false;
        boolean t = false;
        boolean u = false;
        boolean v = false;
        
        if(b == s) {
            a = true;
        }
        System.out.println("The byte " + b + " is the same as the short " + s + "? " + a);

        if(b == i) {
            c = true;
        }
        System.out.println("The byte " + b + " is the same as the integer " + i + "? " + c);
         
        if(b == L) {
            e = true;
        }
        System.out.println("The byte " + b + " is the same as the long " + L + "? " + e);
        
        if(b == f) {
            g = true;
        }
        System.out.println("The byte " + b + " is the same as the float " + f + "? " + g);
        
        if(b == d) {
            h = true;
        }
        System.out.println("The byte " + b + " is the same as the double " + d + "? " + h);
        
        if(s == i) {
            j = true;
        }
        System.out.println("The short " + s + " is the same as the integer " + i + "? " + j);
        
        if(s == L) {
            k = true;
        }
        System.out.println("The short " + s + " is the same as the long " + L + "? " + k);
        
        if(s == f) {
            l = true;
        }
        System.out.println("The short " + s + " is the same as the float " + f + "? " + l);
        
        if(s == d) {
            m = true;
        }
        System.out.println("The short " + s + " is the same as the double " + d + "? " + m);
        
        if(i == L) {
            n = true;
        }
        System.out.println("The integer " + i + " is the same as the long " + L + "? " + n);
        
        if(i == f) {
            o = true;
        }
        System.out.println("The integer " + i + " is the same as the float " + f + "? " + o);
        
        if(i == d) {
            p = true;
        }
        System.out.println("The integer " + i + " is the same as the double " + d + "? " + p);
        
        if(L == f) {
            q = true;
        }
        System.out.println("The long " + L + " is the same as the float " + f + "? " + q);
        
        if(L == d) {
            r = true;
        }
        System.out.println("The long " + L + " is the same as the double " + d + "? " + r);
        
        if(f == d) {
            t = true;
        }
        System.out.println("The float " + f + " is the same as the double " + d + "? " + t);
        
        if(s1 == s2) {
            u = true;
        }
        System.out.println(s1 + " is the same as " + s2 + "? " + u);
        
        if((s1+s2) == s3) {
            v = true;
        }
        System.out.println(s1 + s2 + " is the same as " + s3 + "? " + v);
        
        
        
        
        
        
        
        
    }
}
