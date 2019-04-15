package in.cdac.smarthospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    Button register;
    TextView textFirstNm,textLastNm,textNumber,textEmailId,textCity,textStat,textPin,textContry,textPas,textConfpas;
    EditText editFirstNm,editLastNm,editNumber,editEmail,editCity,editState,editPincode,editCountry,editPas,editConfpas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getIntent();
        register= findViewById(R.id.regbtn);
        textFirstNm= findViewById(R.id.textFirst);
        textLastNm= findViewById(R.id.textLastName);
        textNumber= findViewById(R.id.textContact);
        textEmailId= findViewById(R.id.textEmail);
        textCity= findViewById(R.id.textCity);
        textStat= findViewById(R.id.textState);
        textPin= findViewById(R.id.textPinCode);
        textContry= findViewById(R.id.textCountry);
        textPas= findViewById(R.id.textPass3);
        textConfpas= findViewById(R.id.textPassConf);

        editFirstNm= findViewById(R.id.editFirst1);
        editLastNm= findViewById(R.id.editLastName1);
        editNumber= findViewById(R.id.editContact1);
        editEmail= findViewById(R.id.editEmailId1);
        editCity= findViewById(R.id.editCity1);
        editState= findViewById(R.id.editState1);
        editPincode= findViewById(R.id.editPinCode1);
        editCountry= findViewById(R.id.editCountry1);
        editPas= findViewById(R.id.editPass2);
        editConfpas= findViewById(R.id.editPassConf);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //validation check for edit field
                String nm=editFirstNm.getText().toString().trim();
                String lastName=editLastNm.getText().toString().trim();
                try
                {

                   if (nm.length()==0) {
                        editFirstNm.setHint("enter name");
                       Toast.makeText(RegistrationActivity.this, ""+nm, Toast.LENGTH_SHORT).show();
                    }
                    if (lastName.length()==0) {
                        editLastNm.setHint("enter last name");
                    }
                    if ((editNumber.getText().toString().length()!= 0)) {
                        editNumber.setHint("enter contact number");
                    }
                    else if((nm.length()!=0) && ((lastName.length()!=0))) {

                        Toast.makeText(RegistrationActivity.this,lastName+","+nm,Toast.LENGTH_LONG).show();
                        getRegister();
                    }

               }
                catch (NullPointerException e)
                {
                    e.getMessage();
                }

            }
        });

    }
   public void getRegister()
    {
        Intent intent=new Intent(RegistrationActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
