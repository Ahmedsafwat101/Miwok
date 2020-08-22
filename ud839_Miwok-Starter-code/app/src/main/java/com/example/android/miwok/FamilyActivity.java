package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        List<Word> family= new ArrayList<>();
        family.add(new Word("Father","әpә",R.drawable.family_father,R.raw.family_father));
        family.add(new Word("Mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        family.add(new Word("Son","angsi",R.drawable.family_son,R.raw.family_son));
        family.add(new Word("Daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        family.add(new Word("Older Brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        family.add(new Word("Younger Brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        family.add(new Word("Older Sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        family.add(new Word("Younger Sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        family.add(new Word("Grand Mother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        family.add(new Word("Grand Father","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));



        WordAdapter adapter= new WordAdapter(this,family, R.color.category_family);
        ListView familyListView= (ListView) findViewById(R.id.familyListView);
        familyListView.setAdapter(adapter);
    }
}
