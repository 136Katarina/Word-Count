package com.example.codeclan.wordcount;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by katarinazemplenyiova on 18/12/2017.
 */

public class SentenceTest {
    Sentence sentence;


    @Before
    public  void before(){
        sentence = new Sentence();
    }

//    @Test
//    public void startsWithNofWords(){
//        assertEquals(0, sentence.getWordCount());
//    }

//    @Test
//    public void canAddWord(){
//        sentence.addWord("Car");
//        assertEquals(1, sentence.getWordCount());
//    }

    @Test
    public void canCountSeparateWords(){
        assertEquals(3, sentence.getWordCount("Two words are"));
    }


}
