package com.xworkz.streams.optional;

import java.util.Optional;

public class ExampleTwo {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        //ofnullable return optinal describe value or else it return empty option
        String value = optionalValue.orElse("Default Value");
//        Return the value if present, otherwise return other.
        System.out.println(value);
    }
}

