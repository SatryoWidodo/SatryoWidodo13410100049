import java.util.ArrayList;
import java.util.Arrays;

public class DriverWordSearchPuzzle
{
    private static void test1()
    {
        //Test case designed to create puzzle from words entered by the user
         System.out.println("Creating puzzle from words entered by user\n");
        ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("Orange", "Pineapple","Apple", "Melon", "Peach", "Kiwi", "Plum", "Grape","Rasperry","Strawberry"));
        //WordSearchPuzzle puzzle1 = new WordSearchPuzzle(fruit); 
       //puzzle1.getWordSearchList();
        System.out.println();
    }
    
    private static void test2()
    {
        //Test case which loads in a File and generates a puzzle 
        System.out.println("\n\nCreating puzzle from a file(wordsList.txt), with 8 words, with the shortest word being 5 letters and the longest being 18 letters\n");
        WordSearchPuzzle puzzle2 = new WordSearchPuzzle("wordsList.txt", 8, 5, 18);
        //puzzle2.getPuzzleAsString();
        System.out.println();
    }
    
     private static void test3()
    {
        //Test case which loads in a different File and generates a puzzle 
        System.out.println("\n\nCreating puzzle from another file(BasicEnglish.txt), with 15 words, with the shortest word being 2 letters and the longest being 7 letters\n");
        WordSearchPuzzle puzzle2 = new WordSearchPuzzle("BasicEnglish.txt", 15, 2, 7);
        //puzzle2.getPuzzleAsString();
        System.out.println();
    }
    
        private static void test4()
    {
        //Test case which loads in another different File and generates a puzzle 
        System.out.println("\n\nCreating puzzle from another file(BNCWords.txt), with 100 words, with the shortest word being 3 letters and the longest being 7 letters\n");
        WordSearchPuzzle puzzle2 = new WordSearchPuzzle("BNCWords.txt", 100, 3, 7);
        //puzzle2.getPuzzleAsString();
        System.out.println();
    }
    
       private static void test5()
    {
        //Test case designed to create puzzle from words entered by the user
         System.out.println("Creating puzzle from words entered by user (some of the longest words in the English language....)\n");
        ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("ANTIDISESTABLISHMENTARIANISM", "SUPERCALIFRAGILISTICEXPIALIDOCIOUS","HEPATICOCHOLANGIOCHOLECYSTENTEROSTOMIES ", "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS", "HIPPOPOTOMONSTROSESQUIPEDALIAN", "FLOCCINAUCINIHILIPILIFICATION "));
        WordSearchPuzzle puzzle1 = new WordSearchPuzzle(fruit); 
       // puzzle1.getWordSearchList();
        System.out.println();
    }
    public static void main (String[]args){
        System.out.println("--------Test Case One----------------");
        DriverWordSearchPuzzle.test1();
        System.out.println();
         System.out.println("--------Test Case Two----------------");
        DriverWordSearchPuzzle.test2();
         System.out.println();
         System.out.println("--------Test Case Three----------------");
        DriverWordSearchPuzzle.test3();
        System.out.println();
         System.out.println("--------Test Case Four----------------");
        DriverWordSearchPuzzle.test4();
        System.out.println();
         System.out.println("--------Test Case Five----------------");
        DriverWordSearchPuzzle.test5();
        
        //System.out.println("\n\nCreating puzzle from a file, with 8 words, with the shortest word being 5 letters and the longest being 18 letters\n");
       
        //WordSearchPuzzle puzzle2 = new WordSearchPuzzle("wordsList.txt", 8, 5, 18);
        
       
    }

 
}