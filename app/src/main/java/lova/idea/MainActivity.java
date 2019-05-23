package lova.idea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, index.class);  //Lancer l'activité index
                startActivity(intent);
            }
        });
    }


}
