package com.jeffreyleeon.alertdialogboxexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAlertDialogBox();
    }

    private DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Log.d("TAG", "=====button " + which);
        }
    };

    private void showAlertDialogBox() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();

        dialog.setMessage("Your final score: 50/100");
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "positive", listener);
        dialog.setButton(DialogInterface.BUTTON_NEUTRAL, "neutral", listener);
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "negative", listener);

        dialog.show();
    }
}
