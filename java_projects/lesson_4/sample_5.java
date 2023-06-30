package java_projects.lesson_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;



public class sample_5 {

    public static void main(String[] args) {
          
        ArrayDeque<String> states = new ArrayDeque<String>();
        states.add("8, 4, 5");
        states.addFirst("6, 3, 1"); 
             
        // states.add("3");
        // states.addFirst("4"); 
        // states.push("5"); 
        // states.addLast("6"); 
        // states.add("7");  
        
        String sFirst = states.getFirst();
        System.out.println(sFirst);     
        String sLast = states.getLast();
        System.out.println(sLast);    
         
        System.out.printf("Queue size: %d \n", states.size());  
         
               
        while(states.peek()!=null){
            
            System.out.println(states.pop());

        }
    }
}
        
public class sample_5 {
    static void summMatrixes(int[][] matriz1, int[][] matriz2) {
        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
        for (int y = 0; y < matrix1.length; y++) {
            for (int x = 0; x < matrix1[y].length; x++) {
                int numMatrix1 = matrix1[y][x];
                int numMatrix2 = matrix2[y][x];
                int sum = numeroMatrix1 + numeroMatrix2;
                matrixSum[y][x] = sum;
            }
        }
        
        for (int y = 0; y < matrix1.length; y++) {
            for (int x = 0; x < matrix1[y].length; x++) {
                System.out.printf("%5d ", matrix1[y][x]);
            }
            System.out.print(" | ");
            for (int x = 0; x < matrix2[y].length; x++) {
                System.out.printf("%5d ", matrix2[y][x]);
            }
            System.out.print(" | ");
            for (int x = 0; x < matrixSum[y].length; x++) {
                System.out.printf("%5d ", matrixSum[y][x]);
            }
            System.out.print(" | ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 5, 2},
                {8, 6, 6},
                {7, 3, 6},
        };
        int[][] matrix2 = {
                {3, 7, 8},
                {1, 6, 9},
                {8, 7, 9},
        };
        summMatrixes(matrix1, matrix2);
    }
}

// var array1 = [1, 2, 3, 4, 5];
// var array2 = [4, 5, 6];
// var array3 = [];
// for (var i = 0; i < count; i++) {
//     if (array2[i] === undefined) {
//             array2.push(0);
//         } else {
//             if (array1[i] === undefined) {
//               array1.push(0);
//             }
//         }
//         array3.push(array1[i] * array2[i]);
//       }
// document.writeln(array3);


    public static Deque<Integer> inArray(int[] array) {
        Deque<Integer> result = new LinkedList<>();
        for (int i : array) {
            result.add(i);
        }
        System.out.print(result);
        return result;
    }
