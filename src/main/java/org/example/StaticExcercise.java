package org.example;

public class StaticExcercise {

    public StaticExcercise() {}

    public static int totalCount = 10;
    public int instanceCount = 0;

    public static int incrementTotalCount() {
         totalCount++;
        return totalCount;
    }

    public int incrementInstanceCount() {
         instanceCount++;
         return instanceCount;
    }
}
