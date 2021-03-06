package mobappdev.lecture12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mobappdev.lecture12.customlistview.CustomListViewActivity;
import mobappdev.lecture12.listview.ListViewActivity;
import mobappdev.lecture12.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startListViewActivity(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void startCustomListViewActivity(View view) {
        Intent intent = new Intent(this, CustomListViewActivity.class);
        startActivity(intent);
    }

    public void startRecyclerViewActivity(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}
