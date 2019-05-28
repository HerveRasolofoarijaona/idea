package lova.idea;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static lova.idea.R.layout.activity_project;

public class projet extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_project);

        Button detail_tache = findViewById(R.id.id_tache);
//        Button team         = findViewById(R.id.id_team);
        Button index        = findViewById(R.id.id_index);
        Button date         = findViewById(R.id.id_date);

        detail_tache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(projet.this, listeTache.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        index.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(projet.this, index.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        date.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(projet.this, date_project.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

    }
}
