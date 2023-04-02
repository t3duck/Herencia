public class Schoolapp {
    public static void main(String[] args) {

        Student student1 = new Student("julion","ramirez","julionramirez@gmail.com","Iguala,Gro.");
        student1.setControlNumber(123456789);
        student1.setCareer("informatica");
        student1.setGeneralAverage(78.6);

        Teacher teacher1 = new Teacher("juli","ostia","juliostia@gmail.com","Iguala,Gro.");
        teacher1.setAdscription("centro de computación");
        teacher1.setBiocard(123456);
        teacher1.setAssigned_Hours(40);

        System.out.println("===============Student====================");
        System.out.println("El nombre del Student es: " + student1.getName() + " " + student1.getLastName());
        System.out.println("El email del Student es: "+ student1.getEmail());
        System.out.println("La direccion del Student es: "+ student1.getAddress());
        System.out.println("El numero de control de " + student1.getName() + " es: " +student1.getControlNumber());
        System.out.println("La carrera de " + student1.getName() + " es: " +student1.getCareer() + " y su promedio es " + student1.getGeneralAverage());
        System.out.println("===============Teacher====================");
        System.out.println("El nombre del Teacher es: "+ teacher1.getName() + " " + teacher1.getLastName());
        System.out.println("El email del Teacher es: " + teacher1.getEmail());
        System.out.println("La direcion de la teacher es: " + teacher1.getAddress());
        System.out.println("la adscription de " + teacher1.getAdscription() + ", su biocard " +
                teacher1.getBiocard() + " y sus horas asignadas son " + teacher1.getAssigned_Hours() + " horas");

        //probando la sobrecarga de metods
        System.out.println("Soy una persona: " + student1);
        System.out.println("Soy una persona: " + teacher1);

        System.out.println("El Student: " + student1.soy());
        System.out.println("El Teacher: " + teacher1.soy());

    }
}
