package com.jobzsorteia.teste.frases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Não tenha medo da mudança. Coisas boas se vão para que melhores possam vir.a",
                "Vencedor não é aquele que sempre vence, mas sim aquele que nunca para de lutar",
                "Às vezes você tem que levantar sozinho e seguir em frente...",
                "Nunca diga eu não consigo. Você consegue sim, basta ter força de vontade e fé.",
                "No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim.",
                "Até o maior dos prédios começa no chão.",
                "Tudo é possível. O impossível apenas demora mais...",
                "Jamais desista de ser feliz.",
                "Consciente das dificuldades procuro sempre encontrar motivação para os meus sonhos.",
                "Não é com desculpas que irá atingir os seus objetivos!",
                "Esquece, levanta a cabeça. Segue em frente. Amanhã é um novo dia.",
                "Hoje são dias de guerra. Amanhã serão de glória.",
                "Que a minha coragem seja sempre mais forte do que a tentação de parar e desistir.",
                "Se você não lutar por alguma coisa, será vencido por qualquer coisa.",
                "Não podemos vencer sempre, mas é sempre possível lutar com dignidade até ao fim.",
                "Não sabendo que era impossível, foi lá e fez.",
                "Seu maior medo também pode ser sua maior motivação.",
                "Não desista nunca!",
                "Ninguém é igual a você, e isso pode ser sua grande arma.",
                "Não chore porque acabou, sorria porque aconteceu."
        };

        int numero = new Random().nextInt(20);

        TextView texto =  findViewById(R.id.textResultado);
        texto.setText( frases[numero] );
    }
}
