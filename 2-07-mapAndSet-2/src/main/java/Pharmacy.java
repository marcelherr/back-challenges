import java.util.Map;
import java.util.HashMap;

public class Pharmacy {

    private Map<String, Medication> medications;

    public Pharmacy() {
        medications = new HashMap<>();
    }

    public void getCount() {
        System.out.println(medications.size());
    }

    public void saveMedication(String key, Medication medication) {
        medications.put(key, medication);
    }

    public void findMedication(String medicationName) {
        medications.get(medicationName);
    }

    public void removeMedication(String medicationName) {
        medications.remove(medicationName);
    }

    public void printAll() {
        System.out.println(medications);
    }
}
