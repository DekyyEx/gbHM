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

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
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
    public List<Curse> getCure() {
        List<Curse> result = new ArrayList<>();
        for (Personal personal : personals) {
            if (personal instanceof Curse) {
                result.add((Curse) personal);
            }
        }
        return result;
    }

    public List<NonCures> getNonCure() {
        List<NonCures> result = new ArrayList<>();
        for (Personal personal : personals) {
            if (personal instanceof NonCures) {
                result.add((NonCures) personal);
            }
        }
        return result;
    }
}
