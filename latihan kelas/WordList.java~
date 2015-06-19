import java.util.ArrayList;
import java.util.Random;

/**
 * Creates a new WordList that holds words in an arraylist.
 *
 * @author Anna-Karin, Vendela, Alfrida
 * @version 2014-05-15
 */

public class WordList {
 public ArrayList<String> wordList;
 
 public void main(String[] args){
  WordList wl = new WordList();
  System.out.println(wl.getRandomWord());
 }
 
 /**
  * Constructor for WordList. Create a WordList that contains 
  * the words from the parameter array
  * @param words array
  */
 public WordList(ArrayList<String> words){
  wordList = words;
 }
 
 /**
  * Constructor with no parameters.
  * Create a WordList that contains 20 words.
  */
 public WordList(){
  wordList = new ArrayList<String>();
  wordList = new ArrayList<String>();
  wordList.add("GIBBON");
  wordList.add("KAMEL");
  wordList.add("ELEFANT");
  wordList.add("KAPYBARA");
  wordList.add("VARG");
  wordList.add("LEJON");
  wordList.add("HJORT");
  wordList.add("KAKADUA");
  wordList.add("SILVERFISK");
  wordList.add("SPINDEL");
  wordList.add("PINGVIN");
  wordList.add("MINIGRIS");
  wordList.add("PANDA");
  wordList.add("ANTILOP");
  wordList.add("ALPSTENBOCK");
  wordList.add("DELFIN");
  wordList.add("VIKUNJA");
  wordList.add("JUGGERFALK");
  wordList.add("NANDU");
  wordList.add("WATUSSI");
 }
 
 /**
  * Get a random word from wordlist.
  * @return String random word from wordlist
  */
 public String getRandomWord(){
  int length = wordList.size() - 1;
  Random random = new Random();
 
  //get a random index between 0 and size of wordList-1
  int index = random.nextInt(length);

  //return word of index
  return wordList.get(index);
 }
}