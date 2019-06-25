package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.simpletodo.MainActivity.ITEM_POSITION;
import static com.example.simpletodo.MainActivity.ITEM_TEXT;

public class EditTodoActivity extends AppCompatActivity {

    EditText etItemText;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todo);

        etItemText = (EditText) findViewById(R.id.editTodo);
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getIntExtra(ITEM_POSITION, 0);

        getSupportActionBar().setTitle("Edit Item");
    }

    public void onSaveItem(View view) {
        Intent intent = new Intent();
        intent.putExtra(ITEM_TEXT, etItemText.getText().toString());
        intent.putExtra(ITEM_POSITION, position);
        setResult(RESULT_OK, intent);
        finish();
    }
}
