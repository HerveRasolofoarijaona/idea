package lova.idea;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class task extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        Button index = findViewById(R.id.id_ok);

        index.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(task.this, index.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });
    }
}
