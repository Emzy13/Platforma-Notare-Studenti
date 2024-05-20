package Studenti;

public class Bursa extends Medie{
	private Student student;
    private boolean esteEligibil;
    private String tipBursa;

    public Bursa(Student student) {
        this.student = student;
        this.esteEligibil = false;
        this.tipBursa = "";
    }

    public void verificaEligibilitatea() {
    	double media = calculareMedie(student.getSituatie());
        if (media >= 9.5) {
            tipBursa = "Bursa de performanta";
        } else if (media >= 8.5) {
            tipBursa = "Bursa de merit I";
        } else if (media >= 8) {
            tipBursa = "Bursa de merit II";
        } else {
            tipBursa = "Nu este eligibil pentru bursă.";
        }
        System.out.println("Eligibilitate pentru bursă: " + tipBursa);
    }

    public void aplicaPentruBursa() {
        if (this.esteEligibil) {
        	verificaEligibilitatea();
            if (!tipBursa.equals("Nu este eligibil pentru bursă.")) {
                System.out.println("Cerere trimisă pentru " + student.getNume() + " pentru " + tipBursa);
            } else {
                System.out.println(tipBursa);
            }
    }
 }
}
