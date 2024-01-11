package com.xworkz.maxmin;

public class InstanceNull {

    public static void main(String[] args) {
       Object obj = null;
       
       if(obj!=null &&obj instanceof String) {
    	   String stg = (String) obj;
    	   System.out.println("not null:"+stg);
       }else {
    	   System.out.println("you entered null");
       }
       
    }
}
