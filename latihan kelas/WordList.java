import java.util.ArrayList;
import java.util.Random;

public class WordList {
 public ArrayList<String> wordList;
 
 public void main(String[] args){
  WordList wl = new WordList();
  System.out.println(wl.getRandomWord());
 }

 public WordList(ArrayList<String> words){
  wordList = words;
 }
 

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
 

 public String getRandomWord(){
  int length = wordList.size() - 1;
  Random random = new Random();
 
  int index = random.nextInt(length);

  return wordList.get(index);
 }
}