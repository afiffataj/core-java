class MedicalStoreRunner {
    public static void main(String[] args) {
        String medicineName = "Paracetamol";
        int price = 50;

        MedicalStore.store(medicineName, price);

        MedicalStore.store(null, 0);
    }
}