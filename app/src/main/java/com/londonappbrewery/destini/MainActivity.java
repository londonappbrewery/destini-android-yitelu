package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbuttonTop, mButtonBottom;
    TextView mStoryTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (mStoryIndex){
                    case 1:
                        mStoryTextView.setText(R.string.T3_Story);
                        mbuttonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T6_End);
                        mbuttonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        //mStoryIndex = 1;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T3_Story);
                        mbuttonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (mStoryIndex){
                    case 1:
                        mStoryTextView.setText(R.string.T2_Story);
                        mbuttonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T4_End);
                        mbuttonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        //mStoryIndex = 1;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T5_End);
                        mbuttonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        //mStoryIndex = 3;
                        break;
                }

            }
        });


    }
}
