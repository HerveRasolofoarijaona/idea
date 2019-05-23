package lova.idea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*import android.view.Menu;
import android.view.MenuItem;*/


public class index extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Button listeprojet = findViewById(R.id.listeprojet);
        Button listetache = findViewById(R.id.listetask);
        Button listeContact = findViewById(R.id.listcontact);
        Button tache = findViewById(R.id.task);
        Button afficheprojet = findViewById(R.id.projet);

        listeprojet.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(index.this, listProject.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        listetache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(index.this, listeTache.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        listeContact.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(index.this, listContact.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        afficheprojet.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(index.this, projet.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });

        tache.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(index.this, task.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });




    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
