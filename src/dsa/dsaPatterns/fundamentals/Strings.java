package fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Strings {

    public static void main(String[] args){
        String str = "HelloWorld";
        generateAllPossibleSubstrings(str);
    }

    static void generateAllPossibleSubstrings(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    static boolean findSubstring(String str, String s){
        return  str.contains(s);
    }

    static String removeChar(String str, int k){
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(k-1);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    static String insertChar(String str, char ch, int k){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, ch);
        sb.append(ch);   // sb.insert(sb.length(), ch);
        sb.insert(k-1, ch);
        return sb.toString();
    }

    static boolean containsAllLetters(String str){
//        String s = str.toLowerCase();
        boolean[] v = new boolean[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);    //char ch = Character.toLowerCase(str.charAt(i));
            if(ch >= 'a' && ch <= 'z')v[ch-'a'] = true;
        }
        for(boolean i: v)if(!i)return false;
        return true;
    }

    static void firstAndLastIndexOfOccurrenceEachChar(String str){
        Map<Character, int[]> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
                mp.get(ch)[1] = i;
            }else {
                mp.put(ch, new int[]{i, i});
            }
        }

        mp.forEach((key, value)-> {
            System.out.println(key + " " + value[0] + " " + value[1]);
        });
    }

    static void findMaxMinChar1(String str){
        char minChar = Character.MAX_VALUE;
        char maxChar = Character.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch > maxChar) maxChar = ch;
            if(ch < minChar && ch != ' ') minChar = ch;
        }

        System.out.println(maxChar+ " "+ minChar);
    }

    static void findMaxMinChar(String str){
        String s = str.trim().replaceAll("\\s", "");
        char[] arr = s.toCharArray();
        char maxChar = arr[0];
        char minChar = arr[0];
        for(char i: arr){
            if(i > maxChar) maxChar = i;
            if(i < minChar) minChar = i;
        }
        System.out.println(maxChar + " " + minChar);
    }

    static int countWords(String str){
        if(str.isEmpty()) return 0;
        String[] words = str.split("\\s+");
        return words.length;
    }

    static int countWordsOptimal(String str){
        if(str.isEmpty())return 0;
        String[] arr = str.split(" ");
        int count = 0;
        for(String i: arr){
            if(!i.isEmpty()) count++;
        }
        return count;
    }

    static void printASCII(String str){
        for(char i: str.toCharArray()){
            System.out.println(i);
        }
    }

    static void countChars(String str){
        int countNum=0, countSp = 0, countLower = 0, countUpper = 0;
        for(char i: str.toCharArray()){
            if(i >= '0' && i <= '9')countNum++;
            else if( i>= 'a' && i<= 'z')countLower++;
            else if( i>= 'A' && i<= 'Z')countUpper++;
            else countSp++;
        }

        System.out.println(countNum + " " + countLower + " " + countUpper + " " + countSp);
    }

    static void removeSpaces(String str){
        String s = str.trim().replaceAll("\\s+", " ");
        System.out.println(s);
    }
}
