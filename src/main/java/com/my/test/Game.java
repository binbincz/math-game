package com.my.test;

/**
 *  Math teacher's game
 */
public class Game {

    /**
     * a number is fizzbuzz if it satisfy above 2 criterias together
     */
    public  void rule4() {
        int decade=0,unit=0;
        for (int i = 1; i <= 100; i++) {
            decade = i/10;
            unit = i%10;
            if (i%3==0||3==decade||3==unit){
                if (i%5==0||5==decade||5==unit){
                     System.out.println("FizzBuzz");
                }else{
                     System.out.println("Fizz");
                }
            }else if (i%5==0||5==decade||5==unit){
                 System.out.println("Buzz");
            }else{
                 System.out.println(i);
            }

        }
    }
    /**
     * new requirements 2 adding  a number is buzz if it is divisible by 5 or if it has a 5 in it
     */
    public  void rule3() {
        int decade=0,unit=0;
        for (int i = 1; i <= 100; i++) {
            decade = i/10;
            unit = i%10;
            if (i%3==0){
                if (i%5==0){
                    System.out.println("FizzBuzz");  //numbers which are multiples of both three and five
                }else{
                    System.out.println("Fizz");
                }
            }else if (i%5==0||5==decade||5==unit){
                 System.out.println("Buzz");
            }else{
                 System.out.println(i);
            }

        }
    }

    /**
     * new requirements 1 adding  a number is fuzz if it is divisible by 3 or if it has a 3 in it
     */
    public  void rule2() {
        int decade=0,unit=0;
        for (int i = 1; i <= 100; i++) {
            decade = i/10;
            unit = i%10;
            if (i%3==0||3==decade||3==unit){
                 System.out.println("Fizz");
            }else if (i%5==0){
                if (i%3==0){
                    System.out.println("FizzBuzz");  //numbers which are multiples of both three and five
                }else{
                    System.out.println("Buzz");
                }
            }else{
                 System.out.println(i);
            }

        }
    }


    public  void rule1() {
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                if (i%5==0){
                    System.out.println("FizzBuzz");  //numbers which are multiples of both three and five
                }else{
                    System.out.println("Fizz");
                }
            }else if (i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}
