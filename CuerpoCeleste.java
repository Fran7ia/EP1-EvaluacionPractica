import java.lang.Math;

public class CuerpoCeleste {
    private String nombre;
    private double masaKg;
    private double radioKm;
    private double distanciaSol;
    private int cantidadSatelites;

    public CuerpoCeleste(){
        nombre = "Cuerpo Generico";
        masaKg = 7.7e22;
        radioKm = 7000;
        distanciaSol = 700;
        cantidadSatelites = 3;
    }

    public CuerpoCeleste(String nombre, double masaKg, double radioKm) {
        this.nombre = "Cuerpo Generico";
        this.masaKg = 8.9e23;
        this.radioKm = 8000;
        this.distanciaSol = 700;
        this.cantidadSatelites = 3;

        setNombre(nombre);
        setMasaKg(masaKg);
        setRadioKm(radioKm);
    }

    public CuerpoCeleste(String nombre, double masaKg, double radioKm,
                         double distanciaSol, int cantidadSatelites) {
        this.nombre = "Cuerpo Generico";
        this.masaKg = 9.0e21;
        this.radioKm = 9000;
        this.distanciaSol = 700;
        this.cantidadSatelites = 3;

        setNombre(nombre);
        setMasaKg(masaKg);
        setRadioKm(radioKm);
        setDistanciaSol(distanciaSol);
        setCantidadSatelites(cantidadSatelites);
    }

    public String getNombre(){
        return nombre;
    }
    public double getMasaKg(){
        return masaKg;
    }
    public double getRadioKm(){
        return radioKm;
    }
    public double getDistanciaSol(){
        return distanciaSol;
    }
    public int getCantidadSatelites(){
        return cantidadSatelites;
    }


    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Error nombre invalido");
        }
    }

    public void setMasaKg(double masaKg) {
        if (masaKg > 0) {
            this.masaKg = masaKg;
        } else {
            System.out.println("Error la masa debe ser mayor a 0");
        }
    }

    public void setRadioKm(double radioKm) {
        if (radioKm > 0) {
            this.radioKm = radioKm;
        } else {
            System.out.println("Error el radio debe ser mayor a 0");
        }
    }

    public void setDistanciaSol(double distanciaSol) {
        if (distanciaSol >= 0) {
            this.distanciaSol = distanciaSol;
        } else {
            System.out.println("Error la distancia del sol no puede ser negativa");
        }
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        if (cantidadSatelites >= 0) {
            this.cantidadSatelites = cantidadSatelites;
        } else {
            System.out.println("Error la cantidad de satelites no puede ser negativa");
        }
    }

    public double calcularVolumen(){
        return (4.0/3.0)* Math.PI * Math.pow(radioKm, 3);
    }

    public double calcularDensidad(){
        double volumenMetros = calcularVolumen() * Math.pow(1000, 3);
        double densidad = masaKg / volumenMetros;
        return densidad / 1000;
    } //realice esta operacion para obtener el volumen en metros y ni kilometros

    public boolean esHabitable (double temperaturaSuperficie) {
        if (temperaturaSuperficie >= -20 && temperaturaSuperficie <= 50
                && calcularDensidad() > 1) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirReporte(){
        System.out.println("***************************************");
        System.out.println("          REPORTE ASTRONOMICO");
        System.out.println("***************************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masaKg + " kg");
        System.out.println("Radio: " + radioKm + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " millones de km");
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Volumen: " + calcularVolumen() + " km3");
        System.out.println("Densidad: " + calcularDensidad() + " g/cm3");
        System.out.println("---------------------------------------");
    }
}

