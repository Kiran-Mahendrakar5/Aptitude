package com.xworkz.collectionss.one;

public class Main {
    public static void main(String[] args) {
      
        Thread thread1 = new Thread(() -> System.out.println("Zero parameter lambda in thread"));
        
        
        Thread thread2 = new Thread(() -> System.out.println("One parameter lambda in thread"));

       
        Thread thread3 = new Thread(() -> System.out.println("Multiple parameters lambda in thread"));

       
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

