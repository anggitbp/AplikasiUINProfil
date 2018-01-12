package company.profile.app.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends Activity {

    Button back, official, tel, fb, twit, you, in, loc, email;

    String link_official = "http://www.uinsgd.ac.id";
    String link_tel = "+62227800525";
    String link_email = "contact.uin@uinsgd.ac.id";
    String link_fb = "http://m.facebook.com/";
    String link_twit = "http://mobile.twitter.com/";
    String link_you = "http://m.youtube.com/";
    String link_in = "https://touch.www.linkedin.com/#login";
    String link_map = "https://www.google.co.id/maps/place/UIN+Sunan+Gunung+Djati+Bandung/@-6.9312831,107.7151366,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68dd42c254a55d:0xee52343f78dc2e32!8m2!3d-6.9312884!4d107.7173253?hl=id";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        back = (Button) findViewById(R.id.btnBack);
        official = (Button) findViewById(R.id.btnWeb);
        tel = (Button) findViewById(R.id.btnContact);
        fb = (Button) findViewById(R.id.btnFB);
        twit = (Button) findViewById(R.id.btnTwitter);
        you = (Button) findViewById(R.id.btnYoutube);
        in = (Button) findViewById(R.id.btnLinkedin);
        loc = (Button) findViewById(R.id.btnLoc);
        email = (Button) findViewById(R.id.btnEmail);


        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        email.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, link_email);
                startActivity(Intent.createChooser(intent, "Choice App to send email:"));
            }
        });

        official.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_official));
                startActivity(i);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_fb));
                startActivity(i);
            }
        });

        twit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_twit));
                startActivity(i);
            }
        });

        you.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_you));
                startActivity(i);
            }
        });

        in.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_in));
                startActivity(i);
            }
        });

        tel.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + link_tel));
                startActivity(intent);
            }
        });

        loc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(link_map));
                startActivity(i);
            }
        });

    }

}
