import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Adel", 24, "Woman", "Dubai", "dubai");
        Person person1 = new Person("Farida", 21, "Woman", "Japan", "japan");
        Person person2 = new Person("Alina", 21, "Woman", "Korea", "korea");

        Person person3 = new Person();
        person3.setName("Elina");
        person3.setAge(34);
        person3.setGender("Man");
        person3.setCountry("Moscow");
        person3.setCity("Russia");

        Person person4 = new Person();
        person4.setName("Eliza");
        person4.setAge(20);
        person4.setGender("Man");
        person4.setCountry("New York");
        person4.setCity("Chicago");

        Person person5 = new Person();
        person5.setName("Aziz");
        person5.setAge(26);
        person5.setGender("Man");
        person5.setCountry("New York");
        person5.setCity("London");

        Person[] people = {person, person1, person2, person3, person4, person5};

        System.out.println("Most older person is:");
        System.out.println(num(people));
        System.out.println("----------------------------");



        System.out.println((getGender(people, "Woman")));
        System.out.println("-------------------------------");

        System.out.println((getGender2(people, "Man")));




    }

    public static Person num(Person[] people) {
        Person max = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > max.getAge()) {
                max = people[i];
            }
        }
        return max;
    }

    public static String getGender(Person[] people, String gender) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].getGender().equals(gender)) {
                System.out.println(people[i]);
            }
        }

        return "All Woman persons";
    }


    public static String getGender2(Person[] people, String gender){
        for(int i=0; i<people.length; i++){
            if(people[i].getGender().equals(gender)){
                System.out.println(people[i]);
            }
        }
        return "All Man persons";
    }

}



