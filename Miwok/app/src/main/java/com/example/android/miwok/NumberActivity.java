package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        List<Word> numbers= new ArrayList<>();
        numbers.add(new Word("One","Lutti",R.drawable.number_one,R.raw.number_one));
        numbers.add(new Word("Two","Otiiko",R.drawable.number_two,R.raw.number_two));
        numbers.add(new Word("Three","Tolookosu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new Word("Four","Oyyisa",R.drawable.number_four,R.raw.number_four));
        numbers.add(new Word("Five","Massokka",R.drawable.number_five,R.raw.number_five));
        numbers.add(new Word("Six","Temmokka",R.drawable.number_six,R.raw.number_six));
        numbers.add(new Word("Seven","Kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new Word("Eight","Kawinta",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new Word("Nine","Wo'e",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new Word("Ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));



        WordAdapter adapter= new WordAdapter(this,numbers,R.color.category_numbers);
        ListView numberListView= (ListView) findViewById(R.id.numberListView);
        numberListView.setAdapter(adapter);
    }
}
