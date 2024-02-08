package Hm;
import Action.Flyable;
import Action.Goable;
import Action.Swimable;
import client.Animal;
import personal.Curse;
import personal.NonCures;
import personal.Personal;

import java.util.ArrayList;
import java.util.List;
public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public List<Animal> getPatients() {
        return patients;
    }

    public VeterinaryClinic addPatient(Animal patient) {
        patients.add(patient);
        return this;
    }

    public void removePatient(Animal patient) {
        patients.remove(patient);
    }

    public List<Animal> getGoableList() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getFlyableList() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimableList() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swimable) {
                result.add(animal);
            }
        }
        return result;
    }

    private List<Personal> personals = new ArrayList<>();

    public List<Personal> getPersonal() {
        return personals;
    }

    public VeterinaryClinic addPersonal(Personal personal) {
        personals.add(personal);
        return this;
    }

    public void removePersonal(Animal patient) {
        patients.remove(patient);
    }
    public List<Personal> getCureList() {
        List<Personal> result = new ArrayList<>();
        for (Personal personal : personals) {
            if (personal instanceof Curse) {
                result.add(personal);
            }
        }
        return result;
    }

    public List<Personal> getNonCureList() {
        List<Personal> result = new ArrayList<>();
        for (Personal personal : personals) {
            if (personal instanceof NonCures) {
                result.add(personal);
            }
        }
        return result;
    }
}
