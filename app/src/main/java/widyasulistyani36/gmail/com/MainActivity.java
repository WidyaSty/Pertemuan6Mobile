package widyasulistyani36.gmail.com;

import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //kelas MainActivity mewarisi sifat-sifat/atribut dari AppCompatActivity
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v) {
        //Untuk button login
        Intent intentList = new Intent(getApplicationContext(),MainActivityListView.class);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        //Membuka layout username dan password

        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();
        //Mengambil inputan username dan password

        if (usernameKey.equals("widya") && passwordKey.equals("165410086")){
            Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
             Toast.LENGTH_SHORT).show();
            startActivity(intentList);
            //jika login berhasil maka menampilkan "LOGIN SUKSES"
        }else {
            Toast.makeText(getApplicationContext(), "USERNAME ATAU PASSWORD SALAH",
                    Toast.LENGTH_SHORT).show();
            //jika login gagal menampilkan "USERNAME ATAU PASSWORD SALAH"

        }
    }
    public void onClick2(View v) {
        //untuk button registrasi
        Intent intentRegister = new Intent(getApplicationContext(),Register.class);
        startActivity(intentRegister);
        //menampilan class Register

    }
}
