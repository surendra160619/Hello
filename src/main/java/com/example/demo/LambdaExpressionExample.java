package com.example.demo;

import java. util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class LambdaExpressionExample {
    public static void main(String[] args) {
    	
    	int account_number=20;
    	int account_balance=100;
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        Set<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .map(name -> name)
                .collect(Collectors.toSet());
        System.out.println(filteredNames);
    }
}