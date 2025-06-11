package model;

import java.util.Objects;

public class Contact{
    private String name;
    private String phone;


    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phone=" + phone +
                '}';
    }
// -------- Equals Automatico
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact = (Contact) o;
//        return Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
//    }
    @Override
    public boolean equals(Object obj) {
        //if (this == null) return false;
        if(obj== null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        // Aqui obj y this son clase contacto
        Contact c = (Contact) obj;
        return name != null && name.equals(c.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
