public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication("Paracetamol", new Medication("Paracetamol", 10, true));
        pharmacy.saveMedication("Aspirin", new Medication("Aspirin", 7, false));
        pharmacy.saveMedication("Amoxicillin", new Medication("Amoxicillin", 15, true));
        pharmacy.saveMedication("Metformin", new Medication("Metformin", 20, true));
        pharmacy.saveMedication("Simvastatin", new Medication("Simvastatin", 25, false));
        pharmacy.saveMedication("Lisinopril", new Medication("Lisinopril", 12, true));
        pharmacy.saveMedication("Omeprazol", new Medication("Omeprazol", 8, true));
        pharmacy.saveMedication("Clopidogrel", new Medication("Clopidogrel", 5, false));
        pharmacy.saveMedication("Amlodipin", new Medication("Amlodipin", 30, true));
        pharmacy.saveMedication("Losartan", new Medication("Losartan", 18, true));
        pharmacy.printAll();
        pharmacy.getCount();
        pharmacy.saveMedication("Ibuprofen", new Medication("Ibuprofen", 5, true));
        pharmacy.getCount();
        pharmacy.removeMedication("Amoxicillin");
        pharmacy.getCount();
        pharmacy.printAll();
    }
}
