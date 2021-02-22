package com.mycompany.app;

import java.util.List;
import java.util.ArrayList;;

public class Node {

    private char ch;
    private Node[] children;
    private boolean isTerminal;
    private List<String> words;

    public Node(char ch) {
        this.ch = ch;
        this.children = new Node[26];
        this.isTerminal = false;
        this.words = new ArrayList<String>();
    }

    public Node getChild(char ch) {
        return this.children[getPosition(ch)];
    }

    public void setChild(Node child) {
        this.children[getPosition(child.getChar())] = child;
    }

    public void setIsTerminal(boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    private int getPosition(char ch) {
        return ch - 'a';
    }

    public char getChar() {
        return this.ch;
    }

    public void addWord(String word) {
        this.words.add(word);
    }

    public List<String> getWords() {
        return this.words;
    }
    
}