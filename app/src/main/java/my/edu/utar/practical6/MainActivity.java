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
        mySQLiteAdapter.insert("Jason", "CS", 20);
        mySQLiteAdapter.insert("Rocky", "IA", 19);
        mySQLiteAdapter.insert("Susan", "IB", 20);
        mySQLiteAdapter.insert("Diana", "CN", 21);
        mySQLiteAdapter.insert("John", "CN", 20);
        mySQLiteAdapter.insert("Johnathan", "IA", 20);
        mySQLiteAdapter.insert("Derek", "IB", 21);
        mySQLiteAdapter.insert("Daniel", "CS", 19);
        mySQLiteAdapter.insert("Peter", "CN", 19);
        mySQLiteAdapter.insert("Tammy", "CS", 21);
        mySQLiteAdapter.insert("Jenna", "IA", 22);
        mySQLiteAdapter.insert("Joanne", "IB", 21);
        mySQLiteAdapter.close();

        mySQLiteAdapter.openToRead();
        String contentRead = mySQLiteAdapter.queueAll();
        mySQLiteAdapter.close();

        listContent.setText(contentRead);

    }
}