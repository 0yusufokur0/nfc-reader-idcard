
package com.umut.soysal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public static final String KEY_FIRST_NAME = "firstName";
    public static final String KEY_LAST_NAME = "lastName";
    public static final String KEY_GENDER = "gender";
    public static final String KEY_STATE = "state";
    public static final String KEY_NATIONALITY = "nationality";
    public static final String KEY_PHOTO = "photo";
    public static final String KEY_ADRESS = "adress";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_BIRTH_PLACE = "place";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ((TextView) findViewById(R.id.output_first_name)).setText(getIntent().getStringExtra(KEY_FIRST_NAME));
        ((TextView) findViewById(R.id.output_last_name)).setText(getIntent().getStringExtra(KEY_LAST_NAME));
        ((TextView) findViewById(R.id.output_gender)).setText(getIntent().getStringExtra(KEY_GENDER));
        ((TextView) findViewById(R.id.output_state)).setText(getIntent().getStringExtra(KEY_STATE));
        ((TextView) findViewById(R.id.output_nationality)).setText(getIntent().getStringExtra(KEY_NATIONALITY));
        ((TextView) findViewById(R.id.output_adress)).setText(getIntent().getStringExtra(KEY_ADRESS));
        ((TextView) findViewById(R.id.output_phone)).setText(getIntent().getStringExtra(KEY_PHONE));
        ((TextView) findViewById(R.id.output_birthPlace)).setText(getIntent().getStringExtra(KEY_BIRTH_PLACE));

        if (getIntent().hasExtra(KEY_PHOTO)) {
            ((ImageView) findViewById(R.id.view_photo)).setImageBitmap((Bitmap) getIntent().getParcelableExtra(KEY_PHOTO));
        }
    }

}
