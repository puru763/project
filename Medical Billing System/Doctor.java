import java.util.Date;

public class Doctor  extends Person  implements MedicalBilling {

   public  String specialization;
    public long medicalLicenseNumber;
    public int yearsOfExperience;
    public  String hospitalAffiliation;

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                ", medicalLicenseNumber=" + medicalLicenseNumber +
                ", yearsOfExperience=" + yearsOfExperience +
                ", hospitalAffiliation='" + hospitalAffiliation + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }



    public Doctor(String name, String address, String phoneNumber, String email, Date dateOfBirth) {
        super(name, address, phoneNumber, email, dateOfBirth);
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public long getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(long medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }


    @Override
    public void createMedicalBill() {

    }

    @Override
    public void manageMedicalBill() {

    }
}
