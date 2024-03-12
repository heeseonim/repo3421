public class LibraryClass {
    public static void main(String[] args) {
        Library.enter(new Student());
    }
}
class Library {
    static public void enter(Person p) {

    }
}
class Person {
    // Person 의 구성요소
    int height;
}
class Student extends Person {
    // Person 의 구성요소 상속
}
class Animal {
    int height;
}