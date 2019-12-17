package mobile.fasam.edu.br;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaActivity extends DebugActivity {

    EditText txtNome;
    EditText txtEmail;
    ListView listView;

    List<HashMap<String,String>> lista = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista1);


    }


    public void Adicionar(View view) {

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);

        String nome, email;
        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();

        String dados = String.format("Os dados informados foram %s %s", nome,email);

        HashMap<String,String> map = new HashMap<>();
        map.put("nome",nome);
        map.put("email", email);

        lista.add(map);

        String[] de = {"nome", "email"};
        int[] para = {R.id.labelNome,R.id.labelEmail};

    SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), lista, R.layout.item,de,para);

        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);



    }
}
