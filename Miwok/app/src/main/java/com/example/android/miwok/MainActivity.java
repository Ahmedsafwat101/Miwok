/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //                Access all view
        TextView numbersActivity= (TextView) findViewById(R.id.numbers);
        TextView familyaActivity= (TextView) findViewById(R.id.family);
        TextView colorsActivity= (TextView) findViewById(R.id.colors);
        TextView phrasesActivity= (TextView) findViewById(R.id.phrases);




        //        Add onclickListener for each view

        numbersActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent= new Intent(MainActivity.this,NumberActivity.class);
                startActivity(numberIntent);
            }
        });

        familyaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent= new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        colorsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent= new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        phrasesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent= new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(phrasesIntent);
            }
        });



    }



}
