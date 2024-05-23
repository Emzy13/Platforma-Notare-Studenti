package Studenti;

import java.util.*;

public class Student extends Persoana {
    private String grupa;
    private Map<Materie, Integer> situatie;

    public Student(String nume, String prenume, String email, String parola, String grupa) {
        super(nume, prenume, email, parola);
        this.grupa = grupa;
        this.situatie = new HashMap<>();
    }

    public Integer obtineMedia(Materie materie) {
        return this.situatie.get(materie);
    }

    public Map<Materie, Integer> getSituatie() {
        return situatie;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public double medieGenerala() {
        if (situatie.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int media : situatie.values()) {
            suma += media;
        }
        return (double) suma / situatie.size();
    }

    public Feedback creeazaFeedback(String detalii, Materie materie) {
        Profesor profesor = materie.getProfesor();
        Feedback feedback = new Feedback(detalii, this, profesor);
        feedback.trimiteFeedback();
        materie.getProfesor().adaugaFeedback(feedback);
        return feedback;
    }
    public void aplicarePentruBursa() {
        Bursa bursa = new Bursa(this);
        bursa.aplicaPentruBursa();
    }
    
    public void completeazaFormular() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Alege tipul de formular:");
            System.out.println("1. Formular camin");
            System.out.println("2. Plata restanta");
            System.out.println("3. Adeverinta");
            System.out.print("Introduceti numarul corespunzator formularului dorit: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    completeazaFormularCamin(scanner);
                    break;
                case 2:
                    completeazaPlataRestanta(scanner);
                    break;
                case 3:
                    completeazaAdeverinta(scanner);
                    break;
                default:
                    System.out.println("Optiune invalida.");
                    break;
            }
        } finally {
            scanner.close();
        }
    }

    private void completeazaFormularCamin(Scanner scanner) {
        System.out.print("Introdu numele si prenumele: ");
        String numeComplet = scanner.nextLine();
        System.out.print("Introdu numarul de telefon: ");
        String telefon = scanner.nextLine();
        System.out.println("Formular camin completat pentru " + numeComplet + " cu telefon " + telefon);
    }

    private void completeazaPlataRestanta(Scanner scanner) {
        System.out.print("Introdu suma restanta: ");
        double suma = scanner.nextDouble();
        scanner.nextLine();  
        System.out.println("Formular de plata restanta completat pentru suma de " + suma + " lei.");
    }

    private void completeazaAdeverinta(Scanner scanner) {
        System.out.print("Introdu anul universitar: ");
        String anUniversitar = scanner.nextLine();
        System.out.println("Adeverinta completata pentru anul universitar " + anUniversitar);
    }
}
