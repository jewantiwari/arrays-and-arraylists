package arrays_and_arraylists;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
//        Create an empty array with 5 elements
        String[] favoriteMovies =new String[5];
//        give each index in the array a value
        favoriteMovies[0]= "Titanic";
        favoriteMovies[1]= "The West";
        favoriteMovies[2]= "Tiger";
        favoriteMovies[3]= "Thappad";
        favoriteMovies[4]= "TheaterOne";
//        print the entire array to the terminal (you will need to use the Array.toString() method)
        System.out.println(Arrays.toString(favoriteMovies));
//        print the length of the array
        System.out.println(favoriteMovies.length);
//        Create an array with 5 elements and give the values in-line
        int[] favNums ={7,11,23,27,8,9,31};
//        print the entire array to the terminal
        System.out.println(Arrays.toString(favNums));
//        print the length of the array
        System.out.println(favNums.length);
//        change a few values in each array and then print both arrays to the terminal again
        favNums[2]= 90;

        System.out.println(Arrays.toString(favNums));
        System.out.println("Hello World");
    }


}
