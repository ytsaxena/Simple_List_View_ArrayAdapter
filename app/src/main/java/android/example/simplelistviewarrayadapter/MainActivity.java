package android.example.simplelistviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String [] fruits= {"Apple" ,"Banana","Mango","Peach","Orange","Pineapple","Kiwi","Watermelon","Grapes","Apple" ,"Banana","Mango","Peach","Orange","Pineapple","Kiwi","Watermelon","Grapes","Apple" ,"Banana","Mango","Peach","Orange","Pineapple","Kiwi","Watermelon","Grapes"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView =findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.activity_listui,R.id.textviewui,fruits);
        listView.setAdapter(arrayAdapter);

    }
}