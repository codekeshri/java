package com.arvind.dataStructures.strings;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("arvind");
        System.out.println(System.identityHashCode(sb));
        sb.append("keshri");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));

        char ch = sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'Q');
        System.out.println(sb);
        sb.insert(3, 'K');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0, 5);
        System.out.println(sb.length());

        StringBuilder sbr = new StringBuilder("arvind");
    }
}
