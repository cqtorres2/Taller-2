public class Estudiante {
String nombre;
int edad;
public Estudiante (){
    this("Ruben" , 15);
}
public Estudiante(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
@Override
public String toString() {
    return "El nombre del estudiante es " + nombre + " y tiene " + edad + " años de edad";
}
}
