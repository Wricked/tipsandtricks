package com.tipsandtricks;

public class MathUtils {

     void getMultiples(int n) {
         synchronized (this) { // Specify exactly where the thread will run  synchronized
             for (int i = 1; i < 5; i++) {
                 System.out.println(n * i);
                 try {
                     Thread.sleep(400);
                 } catch (Exception e) {
                     System.out.println(e.getMessage());
                 }
             }
        }
    }
}
