package in.cdac.smarthospital;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 10/6/2018.
 */

public class AdminDetailActivity extends AppCompatActivity {

  Button alert;
  TextView textReading,textPatName,textWeigtPresur,textTemp,textHeatbeat;
  String doc="1234";
  String pat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        getIntent();
        alert= findViewById(R.id.buttonAlert);
        textReading= findViewById(R.id.textPatReading);
        textPatName= findViewById(R.id.textPatName);
        textWeigtPresur= findViewById(R.id.textWgt);
        textTemp= findViewById(R.id.textTemp);
        textHeatbeat= findViewById(R.id.textHBt);

        textReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textPatName.setVisibility(View.VISIBLE);
                textWeigtPresur.setVisibility(View.VISIBLE);
                textTemp.setVisibility(View.VISIBLE);
                textHeatbeat.setVisibility(View.VISIBLE);
                textReading.setVisibility(View.VISIBLE);
            }
        });

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri smsUri= Uri.parse("tel:"+doc);

                Intent in=new Intent(Intent.ACTION_VIEW,smsUri);
                in.putExtra("sms body","sms text");

                in.setType("vnd.android-dir/mms-sms");
                in.putExtra("name","kalyan");
                in.putExtra("value","temp");

                PendingIntent pendingIntent=PendingIntent.getActivity(AdminDetailActivity.this,0,in,PendingIntent.FLAG_UPDATE_CURRENT);

                NotificationCompat.Builder builder=new NotificationCompat.Builder(AdminDetailActivity.this)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentText("hello doc")
                        ;


                startActivity(in);
                Toast.makeText(AdminDetailActivity.this,"sms to "+doc,Toast.LENGTH_LONG).show();

                /*
                Uri smsUri = Uri.parse("tel:123456");
Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);
intent.putExtra("sms_body", "sms text");
intent.setType("vnd.android-dir/mms-sms");
startActivity(intent);
                 */

            }
        });

    }
}
