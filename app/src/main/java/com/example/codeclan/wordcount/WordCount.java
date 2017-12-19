package com.example.codeclan.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCount extends AppCompatActivity {
    EditText sentenceEditText;
    TextView answerText;
    Button countButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(),"onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        sentenceEditText = findViewById(R.id.sentence_text);
        answerText = findViewById(R.id.answer_text);
        countButton = findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(),"onCountButtonClicked was called");
        String sentence = sentenceEditText.getText().toString();
        Log.d(getClass().toString(),"The sentence entered was '"+ sentence + "'");
        Sentence newSentence = new Sentence();
        int result = newSentence.getWordCount(sentence);
        answerText.setText(Integer.toString(result));
    }
}
