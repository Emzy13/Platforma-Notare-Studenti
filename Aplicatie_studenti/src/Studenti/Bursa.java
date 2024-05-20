package Studenti;

public class Bursa extends Medie{
	private Student student;
    private boolean esteEligibil;

    public Bursa(Student student) {
        this.student = student;
        this.esteEligibil = false;
    }

    public void verificaEligibilitatea() {
        this.esteEligibil = student.mediaNotelor() >= 8.5;
        System.out.println("Eligibilitate pentru bursă: " + this.esteEligibil);
    }

    public void aplicaPentruBursa() {
        if (this.esteEligibil) {
            System.out.println("Cerere trimisă pentru " + student.getNume());
        } else {
            System.out.println("Nu este eligibil pentru bursă.");
        }
    }
}
