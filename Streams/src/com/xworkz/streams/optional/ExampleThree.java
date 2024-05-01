package com.xworkz.streams.optional;

import java.util.Optional;

//public class ExampleThree {
//    public static void main(String[] args) {
//        String str = null;
//        int length = str.length(); 
//        System.out.println(length);
//    }
//}




public class ExampleThree {
    public static void main(String[] args) {
        String str = null;
        
        Optional<String> optionalStr = Optional.ofNullable(str);
        
        int length = optionalStr.map(String::length).orElse(0);
//map is used to apply a function to the value inside the Optional
        
        System.out.println(length);
    }
}

//public class ExampleThree {
//    public static void main(String[] args) {
//        String str = null;
//        
//        Optional<String> optionalStr = Optional.ofNullable(str);
//        
//        int length = optionalStr.orElse("").length();
//        
//        System.out.println(length);
//    }
//}


