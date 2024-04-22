package com.xworkz.maps;

public class Generic<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Generic<Integer> integerBox = new Generic<>();
        integerBox.setValue(10);
        int intValue = integerBox.getValue(); // No casting needed
        System.out.println("Integer value: " + intValue);

        Generic<String> stringBox = new Generic<>();
        stringBox.setValue("Hello, Generics!");
        String stringValue = stringBox.getValue(); // No casting needed
        System.out.println("String value: " + stringValue);
    }
}
