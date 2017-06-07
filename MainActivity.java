package br.com.example.rafael.jogodedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDado;
    private ImageView imageViewDado2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDado = (ImageView)findViewById(R.id.idImageViewDado1);
        imageViewDado2 = (ImageView)findViewById(R.id.idImageViewDado2);
        button = (Button) findViewById(R.id.btnJogar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero = geraNumero();
                int numero2 = geraNumero();
                switch (numero) {
                    case 1:  imageViewDado.setImageResource(R.drawable.dado1);;
                        break;
                    case 2:  imageViewDado.setImageResource(R.drawable.dado2);;
                        break;
                    case 3:  imageViewDado.setImageResource(R.drawable.dado3);;
                        break;
                    case 4:  imageViewDado.setImageResource(R.drawable.dado4);;
                        break;
                    case 5:  imageViewDado.setImageResource(R.drawable.dado5);;
                        break;
                    case 6:  imageViewDado.setImageResource(R.drawable.dado6);;
                        break;
                    default: imageViewDado.setImageResource(R.drawable.dado1);;
                        break;
                }
                switch (numero2) {
                    case 1:  imageViewDado2.setImageResource(R.drawable.dado1);;
                        break;
                    case 2:  imageViewDado2.setImageResource(R.drawable.dado2);;
                        break;
                    case 3:  imageViewDado2.setImageResource(R.drawable.dado3);;
                        break;
                    case 4:  imageViewDado2.setImageResource(R.drawable.dado4);;
                        break;
                    case 5:  imageViewDado2.setImageResource(R.drawable.dado5);;
                        break;
                    case 6:  imageViewDado2.setImageResource(R.drawable.dado6);;
                        break;
                    default: imageViewDado2.setImageResource(R.drawable.dado1);;
                        break;
                }
                String ganhador;
                if (numero > numero2){
                    ganhador = "Dado 1 "+numero;
                } else {
                    if (numero2 > numero) {
                        ganhador = "Dado 2 "+numero2;
                    } else {
                        ganhador = "Nenhum do dois, Empate";
                    }
                }
                Toast.makeText(getBaseContext(), "O ganhador é "+ganhador, Toast.LENGTH_SHORT).show();

            }
        });

    }
    public int geraNumero() {
        Random gerador = new Random();

        int numero = gerador.nextInt(6) + 1;
        return numero;

    }
}
