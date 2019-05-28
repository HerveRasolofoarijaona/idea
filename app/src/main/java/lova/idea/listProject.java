package lova.idea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class listProject extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_projet);

        listView =findViewById(R.id.listView);

        String[] listeProjet = new String[]{
                "Projet 1",
                "Projet 2",
                "Projet 3",
                "Projet 4",
                "Projet 5"
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listeProjet);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        Button detail_projet = findViewById(R.id.id_detail_projet);
        Button detail_tache = findViewById(R.id.id_list_tache);

        detail_projet.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(listProject.this, projet.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        detail_tache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(listProject.this, listeTache.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });
    }

}
