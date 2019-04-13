package widyasulistyani36.gmail.com;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;

public class MainActivityListView extends AppCompatActivity {
    ListView list;
    String[] maintitle = {"Widya Sulistyani", "Yuliana Anjarwaty", "Nur Fajriani", "Sirojudin A", "Triyudo W",};
    String[] subtitle = {"widyasulistyani36@gmail.com", "yulianaanjarwaty@gmail.com", "nurfajriani@gmail.com", "sirojudinag@gmail.com", "triyudo@gmail.com",};
    Integer[] imgid = {R.drawable.aku, R.drawable.anjar,
            R.drawable.nur, R.drawable.judin, R.drawable.yudo};
    // Menampilkan layout : nama, email dan foto
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);
        //Menampilkan layout activity_main_listview
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    // code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast. LENGTH_SHORT).show();
                }                      else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }                   else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }                   else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


