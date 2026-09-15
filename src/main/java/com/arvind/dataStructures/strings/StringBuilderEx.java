package com.arvind.dataStructures.strings;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("arvind");
        System.out.println(System.identityHashCode(sb));
        sb.append("keshri");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
    }
}
