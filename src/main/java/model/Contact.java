package model;

public class Contact<T,U>{
    private T name;
    private U phone;


    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public U getPhone() {
        return phone;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phone=" + phone +
                '}';
    }
}
