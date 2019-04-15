package in.cdac.smarthospital.pojohspital;

import java.util.List;

/**
 * Created by Admin on 10/6/2018.
 */

public class PatientPojo {

    int patient_id;
    String patient_first_name;
    String patient_last_name;
    String contactNumber;
    String emailId;
    String password;
    List<AddressPojo>addressPojoList;

    public PatientPojo() {
    }


    public PatientPojo(String patient_first_name, String password) {
        this.patient_first_name = patient_first_name;
        this.password = password;
    }

    public PatientPojo(int patient_id, String patient_first_name, String patient_last_name, String contactNumber, String emailId, List<AddressPojo> addressPojoList) {
        this.patient_id = patient_id;
        this.patient_first_name = patient_first_name;
        this.patient_last_name = patient_last_name;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.addressPojoList = addressPojoList;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_first_name() {
        return patient_first_name;
    }

    public void setPatient_first_name(String patient_first_name) {
        this.patient_first_name = patient_first_name;
    }

    public String getPatient_last_name() {
        return patient_last_name;
    }

    public void setPatient_last_name(String patient_last_name) {
        this.patient_last_name = patient_last_name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
        return "PatientPojo{" +
                "patient_id=" + patient_id +
                ", patient_first_name='" + patient_first_name + '\'' +
                ", patient_last_name='" + patient_last_name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", addressPojoList=" + addressPojoList +
                '}';
    }
}
