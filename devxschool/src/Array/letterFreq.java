package Array;
import java.util.*;
    public class letterFreq {
        public static void main(String[] args) {
            String str = "hello ";
            letterFreq letterFreq = new letterFreq();
            System.out.println(letterFreq.method(str));
        }
        public HashMap <Character,Integer> method(String str){
            HashMap <Character,Integer> resultMap = new HashMap<>();
            char [] strToChar = str.toCharArray();
            for(char letter : strToChar){
                if(!resultMap.containsKey(letter)){
                    resultMap.put(letter,1);
                }
                else
                    resultMap.put(letter,resultMap.get(letter)+1);
            }
            return resultMap;
        }
    }

