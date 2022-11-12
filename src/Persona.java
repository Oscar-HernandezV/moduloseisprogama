public class Persona {
    protected String nombre;
    protected String oficio;
    protected String sexo;
    protected int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOficio() {
        return oficio;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        System.out.println("Persona");
        //Polimorfismo
        Persona personaUno = new Doctor();
        personaUno.nombre = "Angel Cafati Diaz";
        personaUno.oficio = "Doctor";
        personaUno.sexo = "Masculino";
        personaUno.edad = 38;
        System.out.println("Nombre: " + personaUno.getNombre());
        System.out.println("Oficio: " + personaUno.getOficio());
        System.out.println("Sexo: " + personaUno.getSexo());
        System.out.println("Edad: " + personaUno.getEdad());

        Doctor docUno = new Doctor();
        System.out.println("Especialidad: " +docUno.getEspecialidad());
        System.out.println("Lugar de trabajo : " +docUno.getLugarTrabajo());

        System.out.println("\nPersona Dos");
        //Polimorfismo
        Persona personaDos = new Deportista();
        personaDos.nombre = "Michael Jordan";
        personaDos.oficio = "Deportista Profesional";
        personaDos.sexo = "Masculino";
        personaDos.edad = 42;
        System.out.println("Nombre: " + personaDos.getNombre());
        System.out.println("Oficio: " + personaDos.getOficio());
        System.out.println("Sexo: " + personaDos.getSexo());
        System.out.println("Edad: " + personaDos.getEdad());
        Deportista deportista = new Deportista();
        System.out.println("Deporte: " +deportista.getDeporte());
        System.out.println("Liga: " +deportista.getLiga());
    }
}
