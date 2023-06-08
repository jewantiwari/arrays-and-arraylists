package arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsPractice {
    public static void main(String[] args) {
//        Create an ArrayList
        ArrayList<String> movieList = new ArrayList<>();

                movieList.add("Titanic");
                movieList.add("The GodFather");
                movieList.add("The Dark Knight");
                movieList.add("Fight Club");
                movieList.add("Pulp Fiction");

//        add 5 elements to it
//        print the entire ArrayList to the terminal
        System.out.println(movieList);

//        print the length of it
        System.out.println(movieList.size());
//        remove some elements from the ArrayList
        movieList.remove("Fight Club");

//        print the entire ArrayList again
        System.out.println(movieList);
//        change some values in the ArrayList
        movieList.set(4, "Terminator");
//        print it again to see your changes
        System.out.println(movieList);

//        Create an ArrayList with 5 elements and give the value in-line (you will need to use Arrays.asList())

                // Create an ArrayList of popular business shows
                ArrayList<String> businessShows = new ArrayList<>(Arrays.asList(
                        "Suits",
                        "Billions",
                        "The Office",
                        "Silicon Valley",
                        "Mad Men"
                ));
                for (String show: businessShows){
                System.out.println(show);}
            }

//        mess around with a couple methods for ArrayLists. Just type out the ArrayList variable name you made and then put a "." and scroll through the list of methods.
//        read the information it shows you and try to figure out how to use it.
//        create different conditionals using "if-else" statements to test different methods. For example:
//        if (myArray.contains("something")){
//        then do something
//        }
//        print out whatever you need to the terminal to check and see if the methods work the way you think they should.




    }

