import java.util.ArrayList;

public class Rubrica {
    //parametri
    private ArrayList<Contact> contatti = new ArrayList<>();
    //costruttore
    public Rubrica() {
        contatti = new ArrayList<Contact>();
    }
    //metodi
    public void addContact(Contact c) {
        contatti.add(c);
    }
    public void printContacts() {
        for (Contact c : contatti) {
            String contact = "id= "+ c.getId()+" name= "+ c.getName()+" surname= "+c.getSurname()+" email= "+ c.getEmail()+" phone= "+ c.getPhone();
            System.out.println(contact);
        }
    }
    public void findContactSurname(String surname) {
        for (Contact c : contatti) {
            if(c.getSurname().equals(surname)){
                String contact = "id= "+ c.getId()+" name= "+ c.getName()+" surname= "+c.getSurname()+" email= "+ c.getEmail()+" phone= "+ c.getPhone();
                System.out.println(contact);
            }
        }
    }
    public void findContactSurnameName(String surname, String name) {
        for (Contact c : contatti) {
            if(c.getSurname().equals(surname) || c.getSurname().equals(name)){
                String contact = "id= "+ c.getId()+" name= "+ c.getName()+" surname= "+c.getSurname()+" email= "+ c.getEmail()+" phone= "+ c.getPhone();
                System.out.println(contact);
            }
            else if(c ==null){
                System.out.println("Non e stato trovato il contatto");
            }
        }
    }
    public void deleteContact(String surname, String name) {
        for (Contact c : contatti) {
            if(c.getSurname().equals(surname) || c.getSurname().equals(name)){
                String contact = "id= "+ c.getId()+" name= "+ c.getName()+" surname= "+c.getSurname()+" email= "+ c.getEmail()+" phone= "+ c.getPhone();
                System.out.println("Rimosso: "+contact);
                contatti.remove(c);
            } else if (c == null) {
                System.out.println("Non e stato trovato il contatto da rimuovere");
            }
        }
    }
    public void modifyContact(String id, String campo, String modifica){
        for (Contact c : contatti) {
            if(c.getId().equals(id)){
                if(campo == "name"){
                    c.setName(modifica);
                }
                if(campo == "surname"){
                    c.setSurname(modifica);
                }
                if(campo == "email"){
                    c.setEmail(modifica);
                }
                if(campo == "phone"){
                    c.setPhone(modifica);
                }
            }
        }
    }
}
