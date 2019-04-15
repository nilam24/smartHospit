package in.cdac.smarthospital.pojohspital;

import java.util.List;

/**
 * Created by Admin on 10/6/2018.
 */

public class HsPojo {

    int hs_id;
    String hs_name;
    List<AddressPojo>addressPojoList;
    List<DocPojo>docPojoList;
    List<PatientPojo>patientPojoList;

    public HsPojo() {
    }

    public HsPojo(int hs_id, String hs_name, List<AddressPojo> addressPojoList, List<DocPojo> docPojoList, List<PatientPojo> patientPojoList) {
        this.hs_id = hs_id;
        this.hs_name = hs_name;
        this.addressPojoList = addressPojoList;
        this.docPojoList = docPojoList;
        this.patientPojoList = patientPojoList;
    }

    public int getHs_id() {
        return hs_id;
    }

    public void setHs_id(int hs_id) {
        this.hs_id = hs_id;
    }

    public String getHs_name() {
        return hs_name;
    }

    public void setHs_name(String hs_name) {
        this.hs_name = hs_name;
    }

    public List<AddressPojo> getAddressPojoList() {
        return addressPojoList;
    }

    public void setAddressPojoList(List<AddressPojo> addressPojoList) {
        this.addressPojoList = addressPojoList;
    }

    public List<DocPojo> getDocPojoList() {
        return docPojoList;
    }

    public void setDocPojoList(List<DocPojo> docPojoList) {
        this.docPojoList = docPojoList;
    }

    public List<PatientPojo> getPatientPojoList() {
        return patientPojoList;
    }

    public void setPatientPojoList(List<PatientPojo> patientPojoList) {
        this.patientPojoList = patientPojoList;
    }

    @Override
    public String toString() {
        return "HsPojo{" +
                "hs_id=" + hs_id +
                ", hs_name='" + hs_name + '\'' +
                ", addressPojoList=" + addressPojoList +
                ", docPojoList=" + docPojoList +
                ", patientPojoList=" + patientPojoList +
                '}';
    }
}
