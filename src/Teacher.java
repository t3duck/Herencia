public class Teacher extends Person{
    private String adscription;
    private int biocard;
    private int assigned_Hours;

    public Teacher() {
    }
    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }
    public Teacher(String name, String lastName, String email, String address,
                   String adscription, int biocard, int assigned_Hours) {
        super(name, lastName, email, address);
        this.adscription = adscription;
        this.biocard = biocard;
        this.assigned_Hours = assigned_Hours;
    }
    public String getAdscription() {
        return adscription;
    }
    public void setAdscription(String adscription) {
        this.adscription = adscription;
    }
    public int getBiocard() {
        return biocard;
    }
    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }
    public int getAssigned_Hours() {
        return assigned_Hours;
    }
    public void setAssigned_Hours(int assigned_Hours) {
        this.assigned_Hours = assigned_Hours;
    }
    public String toString() {
        System.out.println("=================Datos del Maestro==============");
        System.out.println("El nombre del maestro: " + this.getName() + " " + this.getLastName());
        System.out.println("El correo del maestro es: " + this.getEmail());
        System.out.println("La direccion del maestro es: " + this.getAddress());
        System.out.println("La biocard del maestro: " + this.getAdscription());
        System.out.println("La abscrision del maestro: " + this.getBiocard());
        System.out.println("Sus horas asigandas son: " + this.getAssigned_Hours());
        return "Soy un Maestro";
    }
    public String soy() {
        return "una persona y un Maestro";
    }
}
