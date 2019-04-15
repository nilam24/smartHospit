package in.cdac.smarthospital.utils;

import android.util.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.HashMap;

import in.cdac.smarthospital.pojohspital.DocPojo;
import in.cdac.smarthospital.pojohspital.PatientPojo;

import static in.cdac.smarthospital.utils.ConnectionUtils.getConnection;

/**
 * Created by Admin on 10/6/2018.
 */

public class DaoUtils {

    /*
     Connection con;
    PreparedStatement pst;
    HashMap<String,String> map;
    String loginname,pw;
     */
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst2;
    HashMap<String,String>mapDoc;
    HashMap<String,String>mapPat;
    String loginame,pwd;
    String loginame2,pwd2;

    public DaoUtils() throws SQLException {

        try (AutoCloseable connection = con = getConnection()) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String sql="select * from tab";
        String sql2="select * from tablename";
        pst=con.prepareStatement(sql);
        pst2=con.prepareStatement(sql2);
        mapDoc=new HashMap<>();
        mapPat=new HashMap<>();

    }

    public void cleanUp() throws Exception {

        if (pst != null) {
            pst.close();

        }
        if(pst2!=null)
        {
            pst2.close();
        }
        if (con != null) {
            con.close();
        }

    }
      public HashMap<String,String> doLoginDoc() throws SQLException {

          DocPojo docPojo=new DocPojo();
         try(ResultSet rst=pst.executeQuery()){
            while(rst.next()){

                loginame=rst.getString("doc_first_name");
                pwd=rst.getString("password");
                docPojo=new DocPojo(loginame,pwd);
                mapDoc.put("doc_first_name",loginame);
                mapDoc.put("password",pwd);
                Log.e("docpojo detail----",loginame+pwd);
            }

        }
        return mapDoc;

    }
  public HashMap<String,String> doLoginPat() throws SQLException {

          PatientPojo patientPojo=new PatientPojo();
         try(ResultSet rst=pst2.executeQuery()){
            while(rst.next()){

                loginame=rst.getString("patient_first_name");
                pwd=rst.getString("password");
                patientPojo=new PatientPojo(loginame2,pwd2);
                mapDoc.put("patient_first_name",loginame2);
                mapDoc.put("password",pwd2);
                Log.e("Patpojo detail----",loginame2+pwd2);
            }

        }
        return mapPat;

    }

}
