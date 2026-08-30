package fundamentals;

public class Strings {

    public static void main(String[] args){
        String str = "Hello    World";
        System.out.println(countWords(str));
    }

    static int countWords(String str){
        if(str.isEmpty()) return 0;
        String[] words = str.split("\\s+");
        return words.length;
    }
}
