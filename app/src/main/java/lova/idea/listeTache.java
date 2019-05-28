package lova.idea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listeTache extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste__tache);

        Button index        = findViewById(R.id.id_ok);
        Button tache         = findViewById(R.id.detail_tache);

        index.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(listeTache.this, index.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        tache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(listeTache.this, task.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });


    }
}
