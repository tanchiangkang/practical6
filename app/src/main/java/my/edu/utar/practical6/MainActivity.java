package my.edu.utar.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SQLiteAdapter mySQLiteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView listContent = new TextView(this);

        setContentView(listContent);

        mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToWrite();
        mySQLiteAdapter.insert("Jason");
        mySQLiteAdapter.insert("Rocky");
        mySQLiteAdapter.insert("Susan");
        mySQLiteAdapter.insert("Diana");
        mySQLiteAdapter.insert("John");
        mySQLiteAdapter.insert("Johnathan");
        mySQLiteAdapter.insert("Derek");
        mySQLiteAdapter.insert("Daniel");
        mySQLiteAdapter.insert("Peter");
        mySQLiteAdapter.insert("Tammy");
        mySQLiteAdapter.insert("Jenna");
        mySQLiteAdapter.insert("Joanne");
        mySQLiteAdapter.close();

        mySQLiteAdapter.openToRead();
        String contentRead = mySQLiteAdapter.queueAll();
        mySQLiteAdapter.close();

        listContent.setText(contentRead);

    }
}