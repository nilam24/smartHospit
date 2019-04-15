package in.cdac.smarthospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import in.cdac.smarthospital.utils.DaoUtils;

/**
 * Created by Admin on 10/6/2018.
 */

public class AdminActivity extends AppCompatActivity {

    TextView textName1,textPass1;
    EditText editName1,editPass1;
    Button btnLogin,btnRegister;
    String editUser;
    String editPassword;
    DaoUtils daoUtils;
    String daouser2="aaa";
    String daopass2="1212";
    HashMap<String,String> map2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_laout);

        textName1= findViewById(R.id.textPName);
        textPass1= findViewById(R.id.textPPass);
        editName1= findViewById(R.id.editPName);
        editPass1= findViewById(R.id.editPPass);
        btnLogin= findViewById(R.id.loginbtn1);
        btnRegister= findViewById(R.id.register11);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(AdminActivity.this,AdminDetailActivity.class);
                editUser=editName1.getText().toString().trim();
                editPassword=editPass1.getText().toString().trim();

                //condition check for login details
                if((editUser.equals(daouser2))&&(editPassword.equals(daopass2)))
                {
                    Log.e( "tag","login success");
                    startActivity(intent);
                }

                else {
                    editName1.setHint("invalid user and password");
                    Log.e("","login fail");
                }

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(AdminActivity.this,RegistrationActivity.class);
                startActivity(intent1);
            }
        });

    }

}
