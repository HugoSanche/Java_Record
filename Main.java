public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("242424","Karina Lopez","05/11/1982","Gerente de Ventas");
        LPAStudent recordStudent = new LPAStudent("242424","Hugo B","05/07/1980","Web Developmer");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+", java cetificated 8.0");

        //record is inmutable you cannot call setters
        //recordStudent.setClassList(pojoStudent.getClassList()+", java cetificated 8.0");

        //check pojoStudent use getName() and getClassList()
        System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList()+", su cumpleaños es "+pojoStudent.getDateOfBirth());

        //check the recordStudent use name() and used .classList()
        System.out.println(recordStudent.name()+" is taking "+recordStudent.classList()+", su cumpleaños es "+recordStudent.dateOfBirth());
    }
}
