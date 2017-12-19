package com.example.codeclan.wordcount;

import java.util.ArrayList;

/**
 * Created by katarinazemplenyiova on 18/12/2017.
 */

public class Sentence {
//    ArrayList<String> words;
    String [] wordArray;
//
//    public Sentence(){
//        this.words = new ArrayList<>();
//    }

    public int getWordCount(String word) {
        wordArray = word.split(" ");
        return wordArray.length;
    }

//    public void addWord(String word) {
//        this.words.add(word);
//    }


}

