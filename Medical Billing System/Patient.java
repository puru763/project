import java.util.Date;

public class Patient   extends Person  implements MedicalBilling{


    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    public String getPrimaryCarePhysician() {
        return primaryCarePhysician;
    }

    public void setPrimaryCarePhysician(String primaryCarePhysician) {
        this.primaryCarePhysician = primaryCarePhysician;
    }

    public  String medicalHistory;
    public String insuranceInfo;
    public String primaryCarePhysician;

    @Override
    public String toString() {
        return "Patient{" +
                "medicalHistory='" + medicalHistory + '\'' +
                ", insuranceInfo='" + insuranceInfo + '\'' +
                ", primaryCarePhysician='" + primaryCarePhysician + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }




    public Patient(String name, String address, String phoneNumber, String email, Date dateOfBirth) {
        super(name, address, phoneNumber, email, dateOfBirth);
    }

    @Override
    public void createMedicalBill() {

    }

    @Override
    public void manageMedicalBill() {

    }
}
