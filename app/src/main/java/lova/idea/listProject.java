package lova.idea;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
                System.out.println("tu as cliqué sur le " + i + "eme item");
                String itemValue = (String) listView.getItemAtPosition(i);
                System.out.println("Valeur de l'item : " + itemValue);
            }
        });

    }

}
