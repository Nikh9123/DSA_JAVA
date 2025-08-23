package Maths.easy;

import java.util.Set;
import java.util.TreeSet;

public class Sample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Indian");
        treeSet.add("Premier");
        treeSet.add("League");
        treeSet.add("Premier");
        treeSet.add("IndianPremierLeague");
        for (String temp : treeSet)
            System.out.println(temp + " ");
    }
} 
