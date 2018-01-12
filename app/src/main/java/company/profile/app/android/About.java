package company.profile.app.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends Activity {

    Button back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        back = (Button) findViewById(R.id.btnBack);

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}
