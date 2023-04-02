public class Student extends Person {
    private int controlNumber;
    private String career;
    private double generalAverage;

    public Student() {
    }
    public Student(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }
    public Student(String name, String lastName, String email, String address,
                   int controlNumber, String career, double generalAverage) {
        super(name, lastName, email, address);
        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }
    public int getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public double getGeneralAverage() {
        return generalAverage;
    }
    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }
    public String toString() {
        System.out.println("================Datos del alumno=======================");
        System.out.println("El nombre del alumno: " + this.getName() + " " + this.getLastName());
        System.out.println("El correo del alumno es: " + this.getEmail());
        System.out.println("La direccion del alumno es: " + this.getAddress());
        System.out.println("Con numero de control: " + this.getControlNumber());
        System.out.println("La carrera del alumno es: " + this.getCareer());
        System.out.println("Su promedio es: " + this.getGeneralAverage());
        return "Soy un Estudiante";
    }
    public String soy() {
        return "una persona y un Estudiante";
    }
}
