package com.example.user.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.cookies.R;


public class MainActivity extends AppCompatActivity {

    Button button;          // "outlet" for the button
    boolean cookieGone;     // keep track of which image/text is shown


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // intialize the button with a click handler
        button = (Button) findViewById(R.id.press);
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


        // Get image and textbox
        ImageView firstImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        TextView textView = (TextView) findViewById(R.id.status_text_view);

        if (cookieGone == false) {
            // Update image
            firstImage.setImageResource(R.drawable.after_cookie);

            // Update text box
            textView.setText("I'm so full");

            // update text on button
            button.setText("GET NEW COOKIE");

            cookieGone = true;
        }
        else {
            // Update image
            firstImage.setImageResource(R.drawable.before_cookie);
            // Update the textbox
            textView.setText("Eat me!");

            // update text on button
            button.setText("EAT COOKIE!");

            cookieGone = false;
        }


    }
}