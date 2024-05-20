package Studenti;

public class Rapoarte extends Profesoara{
	public void genereazaRaportMaterii(List<Materia> materii) {
        for (Materia mat : materii) {
            System.out.println("Raport pentru: " + mat.getNume());
            // Detalii suplimentare cum ar fi mediile notelor, numărul de studenți, etc.
        }
    }

    public void genereazaRaportProfesori(List<Profesor> profesori) {
        for (Profesor prof : profesori) {
            System.out.println("Raport pentru Profesor: " + prof.getNume());
            // Rezumat al cursurilor predate, feedback-ul studenților, etc.
        }
    }

    public void genereazaRaportFinal() {
        System.out.println("Generare raport final comprehensiv.");
        // Combinarea tuturor datelor și analizelor într-un raport final
    }
}
