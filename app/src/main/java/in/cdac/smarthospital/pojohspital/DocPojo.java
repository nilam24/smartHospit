package in.cdac.smarthospital.pojohspital;

import java.util.List;

/**
 * Created by Admin on 10/6/2018.
 */

public class DocPojo {

    int doc_id;
    String doc_first_name="abc";
    String doc_last_name;
    String doc_contact;
    String doc_email;
    String password="123";
    List<AddressPojo>addressPojoList;

    public DocPojo() {
    }

    public DocPojo(String doc_first_name, String password) {
        this.doc_first_name = doc_first_name;
        this.password = password;
    }

    public DocPojo(int doc_id, String doc_first_name, String doc_last_name, String doc_contact, String doc_email, List<AddressPojo> addressPojoList) {
        this.doc_id = doc_id;
        this.doc_first_name = doc_first_name;
        this.doc_last_name = doc_last_name;
        this.doc_contact = doc_contact;
        this.doc_email = doc_email;
        this.addressPojoList = addressPojoList;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_first_name() {
        return doc_first_name;
    }

    public void setDoc_first_name(String doc_first_name) {
        this.doc_first_name = doc_first_name;
    }

    public String getDoc_last_name() {
        return doc_last_name;
    }

    public void setDoc_last_name(String doc_last_name) {
        this.doc_last_name = doc_last_name;
    }

    public String getDoc_contact() {
        return doc_contact;
    }

    public void setDoc_contact(String doc_contact) {
        this.doc_contact = doc_contact;
    }

    public String getDoc_email() {
        return doc_email;
    }

    public void setDoc_email(String doc_email) {
        this.doc_email = doc_email;
    }

    public List<AddressPojo> getAddressPojoList() {
        return addressPojoList;
    }

    public void setAddressPojoList(List<AddressPojo> addressPojoList) {
        this.addressPojoList = addressPojoList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DocPojo{" +
                "doc_id=" + doc_id +
                ", doc_first_name='" + doc_first_name + '\'' +
                ", doc_last_name='" + doc_last_name + '\'' +
                ", doc_contact='" + doc_contact + '\'' +
                ", doc_email='" + doc_email + '\'' +
                ", password='" + password + '\'' +
                ", addressPojoList=" + addressPojoList +
                '}';
    }
}
