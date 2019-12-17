package mobile.fasam.edu.br;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void ExibirTela(View view) {

        int opcao = view.getId();
        Intent intent;

        switch (opcao){
            case R.id.btnMain:

                intent = new Intent(this, tela1.class);
                startActivity(intent);

                break;
            case R.id.btnLìsta:

                intent = new Intent(this,ListaActivity.class);
                startActivity(intent);

                break;

                default:
                    Toast.makeText(getApplicationContext(), "Opção Invalida",Toast.LENGTH_LONG).show();

                    break;
        }

    }
}
