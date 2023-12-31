package Q3;

class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Application3 {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Ben");
        person.setAge(23);
        person.setAddress("Hyderabad");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        // Display values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
