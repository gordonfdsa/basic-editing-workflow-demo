import java.util.*;
import java.lang.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = new int[100];
        for(int i = 0 ; i < 100;  i++){
            arr[i] = 123;
            System.out.println(arr[i]);
        }
    }
}