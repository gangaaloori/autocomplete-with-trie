package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {

        final Trie trie = new Trie();
        final String[] words = {"apple", "hello", "hi", "madness", "help", "madam", "cat"};
        for (String word : words) {
            trie.add(word);
        }

        System.out.println(trie.search("hel"));
        System.out.println(trie.search("h"));
        System.out.println(trie.search("he"));
        System.out.println(trie.search("hell"));
        System.out.println(trie.search("m"));
        System.out.println(trie.search("mad"));
    }
}
