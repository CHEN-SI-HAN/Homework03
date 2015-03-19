package idv.leo.homework03;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {


    private int fruitNo = 0;

    private ImageView image;

    private TextView textView;

    private Button button01, button02;

    private ArrayList<String> fruit = null;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViews();
        GetFirstFruit();
    }

    private void findViews() {
        fruit = new ArrayList<String>();

        fruit.add("p1");
        fruit.add("p2");
        fruit.add("p3");
        fruit.add("p4");
        fruit.add("p5");
        fruit.add("p6");
        fruit.add("p7");
        fruit.add("p8");
        fruit.add("p9");
        fruit.add("p10");


        button01 = (Button) findViewById(R.id.button01);

        button01.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fruitNo >= fruit.size() - 1)

                    fruitNo = 0;

                else

                    fruitNo++;

                GetFirstFruit();
            }
        });
        button02 = (Button) findViewById(R.id.button02);

        button02.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fruitNo <= fruit.size() - fruit.size())

                    fruitNo = fruit.size() ;
                else

                    fruitNo--;

            }
        });


    }


    private void GetFirstFruit() {

        image = (ImageView) findViewById(R.id.imageView1);
        textView = (TextView)findViewById(R.id.textView);

        String[] fruitarray = new String[fruitNo];

        fruitarray = fruit.toArray(fruitarray);

        String uri = "@drawable/" + fruitarray[fruitNo].toString();

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

        image.setImageResource(imageResource);
        if (fruitNo==fruitNo)
            textView.setText("第"+(fruitNo+1)+"張");



    }


    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

}