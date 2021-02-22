package com.mycompany.app;

import java.util.Collections;
import java.util.List;

public class Trie {

    private Node root;

    public Trie() {
        this.root = new Node('*');
    }

    /**
     * Add given string to the Trie. 
     * 
     * @param word string to be added.
     */
    public void add(String word) { //hello, hi, help

        if (word == null || word.length() == 0) {
            return;
        }
        Node current = root;
        for (char ch : word.toCharArray()) {
            Node child = current.getChild(ch);
            if (child == null) {
                child = new Node(ch);
                current.setChild(child);
            }
            child.addWord(word);
            current = child;
        }
        current.setIsTerminal(true);
    }

    /**
     * Search Trie for words matching with the given prefix.
     * 
     * @param prefix prefix to be matched with.
     * @return list of words matching the given prefix.
     */
    public List<String> search(String prefix) {

        if (prefix == null || prefix.length() == 0){
            return Collections.emptyList();
        }
        Node current = root;
        for (char ch : prefix.toCharArray()) {
            Node child = current.getChild(ch);
            if (child == null) {
                return Collections.emptyList();
            }
            current = child;
        }
        return current.getWords();
    }
    

    /**
     * 
     * h [hello, hi, help]
     * e [hello, help]    i [hi]
     * l [hello, help]
     * l [hello]          p [help]
     * o [hello]
     * 
     */
}