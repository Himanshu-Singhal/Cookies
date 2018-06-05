package com.example.user.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.cookies.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.press);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eatCookie();

            }

        });



    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie() {

        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView firstImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        firstImage.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm so full");

    }
}