package rus.hirunroj.thanapat.suss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passwordEditText;
    private ImageView imageView;
    private static final String urlLogo = "http://swiftcodingthai.com/rus/image/logo_rus.png";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Ind Widget
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText6);
        ImageView = (ImageView) findViewById(R.id.imageView6);

        //Load Image from Server
        Picasso.with(this).load(urlLogo).into(imageView);

    }   // Main Method

    public void clickSignIn(View view){


    }   //clickSign

    public void clickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this,SignUpactivity.class));
    }

}   //Main Class นี่คือ คลาสหลัก นะจ๊ะเว้ย
