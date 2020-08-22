// These challenges were all recommended by Edabit.com, for beginners to Java

public class TenVeryEasy {

    // Create a method that takes two integers as arguments and return their sum.
    public static int sum(int a, int b) {
        int solution = a + b;
        return solution;
    }

    /* Create a function that takes the number of wins, draws and losses
    and calculates the number of points a football team has obtained so far*/
    public static int footballPoints(int wins, int draws, int loses) {
        int solution = (wins*3) + draws;
        return solution;
    }

    // Create a function that takes a number as an argument, increments the number by +1 and returns the result.
    public static int addition(int num) {
        int solution = num + 1;
        return solution;
    }

    // Write a function that returns the string "something" joined with a space " " and the given argument a.
    public static String giveMeSomething(String a) {
        return "something " + a;
    }


    // Create a function that takes length and width and finds the perimeter of a rectangle.
    public static int findPerimeter(int length, int width) {
        int solution = (length*2) + (width*2);
        return solution;
    }

    // Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
    public static int nextEdge(int side1, int side2) {
        int side3Max = side1 + side2 - 1;
        return side3Max;
    }

    // Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
    public static boolean lessThan100(int a, int b) {
        if (a+b < 100){
            return true;
        } else { return false;
        }
    }

    // Write a function that converts hours into seconds.
    public static int howManySeconds(int hours) {
        int seconds = hours*3600;
        return seconds;
    }

    // Create a function that returns true when x is equal to y; otherwise return false.
    public static boolean isSameNum(int x, int y) {
        if (x == y){
            return true;
        }	else {
            return false;
        }
    }

    // Write a function that takes the base and height of a triangle and return its area.
    public static int triArea(int base, int height) {
        int solution = (base*height)/2;
        return solution;
    }
}