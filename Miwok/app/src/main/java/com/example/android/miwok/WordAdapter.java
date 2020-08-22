package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    /***
     * @param context
     * @param list
     * @param colorResourceId
     * @param audioResourceId***/
     private int colorResourceId;
    private Context context;
    private MediaPlayer mediaPlayer;
    public WordAdapter(Context context, List<Word> list, int colorResourceId) {
        super(context, 0,list);
        this.context=context;
        this.colorResourceId=colorResourceId;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        //Set the color of container
       View container = listItemView.findViewById(R.id.container);
       int color = ContextCompat.getColor(getContext(),colorResourceId);
        container.setBackgroundColor(color);
        // Get the {@link AndroidFlavor} object located at this position in the list
        final Word currentWord = getItem(position);
        //Release MediaPlayer resources
        if(mediaPlayer!=null){
            mediaPlayer.release();
        }
        //Set onClickListener to play audio
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer= MediaPlayer.create(context,currentWord.getAudioID());
                mediaPlayer.start();
            }
        });

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.englishWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getEnglish());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getMiwok());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.idImage);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if(currentWord.getImageID()== 0){
            iconView.setVisibility(View.GONE);
        }
        else {
            iconView.setVisibility(View.VISIBLE);
            iconView.setImageResource(currentWord.getImageID());
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
