package GenericClass;

public class Main {
    public static void main(String[]args){
     Character[] characters={'M','E','R','T'};
     Integer[]integers={3,7,5,4,2,9,0};
     Student[]students={new Student("ali",25),new Student("mehmet",56)};
     printClass<Character>characterprintClass=new printClass<>();
     printClass<Integer>integerprintClass=new printClass<>();
     printClass<Student>studentprintClass=new printClass<>();
     characterprintClass.print(characters);
        System.out.println("********");
        integerprintClass.print(integers);
        System.out.println("*********");
        studentprintClass.print(students);
    }
}
