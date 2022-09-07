package Basics;

public class FunctionsExample {
    private int count;

    private void increment(FunctionsExample functionsExample) {
        functionsExample.count++;
    }

    private void incrementInside() {
        this.count++;

    }

    public void printCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        FunctionsExample functionsExample=new FunctionsExample();
        functionsExample.increment(functionsExample);
        functionsExample.printCount();
        functionsExample.incrementInside();
        functionsExample.printCount();
    }
}
