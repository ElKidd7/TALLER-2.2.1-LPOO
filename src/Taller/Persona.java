package Taller;

public class Persona {
    String nombre;
    int edad;
    String sexo;
    String estado_civil;
    int estatura;

    public Persona(String nombre, int edad, String sexo, String estado_civil, int estatura) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setEstado_civil(estado_civil);
        setEstatura(estatura);
    }

    
    
    
    
    public void  dormir(String lugar, int horas, String dia)
    {
        System.out.println("te dormiras en la " + lugar  + " dormiras " + horas + " horas" + " y en " + dia);
    }  
    
    public void hacerEjercicio(String lugar)
    {
        System.out.println("haras ejercicio en " + lugar);
    }
    
    public static void comer(String comida)
    {
        System.out.println("vas a comer " + comida);
    }
    
    
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
    
    
}
