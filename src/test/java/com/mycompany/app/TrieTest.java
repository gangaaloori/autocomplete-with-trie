package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


/**
 * Unit test for Trie.
 */
public class TrieTest {
    
    @Test
    public void searchWithASingleCharShouldReturnMatchingResults(){

        String[] words = {"apple", "hello", "hi", "madness", "help", "madam", "cat"};
        Trie trie = buildTrie(words);
        List<String> results = trie.search("h");
        assertEquals(3, results.size());
    }

    @Test
    public void searchWithoutAnyMatchShouldReturnZeroResults() {

        String[] words = {"apple", "hello", "hi", "madness", "help", "madam", "cat"};
        Trie trie = buildTrie(words);
        List<String> results = trie.search("foobar");
        assertEquals(0, results.size());
    }

    private Trie buildTrie(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.add(word);
        }
        return trie;
    }
}