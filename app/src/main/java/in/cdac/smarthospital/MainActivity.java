package in.cdac.smarthospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import org.w3c.dom.Text;

import java.sql.SQLException;
import java.util.HashMap;

import in.cdac.smarthospital.utils.DaoUtils;

public class MainActivity extends AppCompatActivity {

    TextView textName1,textPass1;
    EditText editName1,editPass1;
    Button btnLogin,btnRegister;
    String editUser;
    String editPassword;
    DaoUtils daoUtils;
    String daouser1="abc";
    String daopass1="123";
    HashMap<String,String>map1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName1= findViewById(R.id.textName);
        textPass1= findViewById(R.id.textPass);
        editName1= findViewById(R.id.editName);
        editPass1= findViewById(R.id.editPass);
        btnLogin= findViewById(R.id.loginbtn);
        btnRegister= findViewById(R.id.register1);
//        try {
//            daoUtils=new DaoUtils();
//            map1=daoUtils.doLoginDoc();
//
//            daouser1=map1.get("doc_first_name");
//            daopass1=map1.get("password");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,DetailDocActivity.class);
                editUser=editName1.getText().toString().trim();
                editPassword=editPass1.getText().toString().trim();

                //condition check for login details
                if((editUser.equals(daouser1))&&(editPassword.equals(daopass1)))
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
                Intent intent1=new Intent(MainActivity.this,RegistrationActivity.class);
                startActivity(intent1);
            }
        });

    }
}
