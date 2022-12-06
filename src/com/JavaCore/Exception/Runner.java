package com.JavaCore.Exception;

public class Runner {
    public static void main(String[] args) {
        try{
            unsafe();;
        } catch(ClassException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
            exception.printStackTrace();
        }
    }
    public static void unsafe() throws ClassException{
        throw new ClassException(new RuntimeException("Exception"));
    }
}
