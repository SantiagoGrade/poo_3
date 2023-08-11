package composicion;

public class Main {
    public static void main(String[] args){

        Direccion d = new Direccion("33","93", "26","Medellin","Medellin");
        FechaNacimiento fN = new FechaNacimiento(2001,06,03);
        Cliente c = new Cliente("Francisco","David","Lopez",fN,d);

        System.out.printf(c.toString());
    }
}
