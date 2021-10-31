package hm5;

public class Employee {
    public static void main(String[] args) {
        Person PersonArray [] = new Person[5];
        PersonArray [0] = new Person("Dmitriy", "Developer", ".ru", 6541, 40500, 27);
        PersonArray [1] = new Person("Vasiliy", "JavaDeveloper", ".com", 7534, 44346, 39);
        PersonArray [2] = new Person("Artem", "AndroidDeveloper", ".org", 5147, 45432, 48);
        PersonArray [3] = new Person("Max", "KotlinDeveloper", ".ru", 3414, 65287, 47);
        PersonArray [4] = new Person("Alex", "CSSDeveloper", ".com", 5347, 54366, 35);

        for (int i =0; i < PersonArray.length; i++) {
            if ( PersonArray[i].getAge() > 40 ) {
                PersonArray[i].print();
            }
        }
    }
}
