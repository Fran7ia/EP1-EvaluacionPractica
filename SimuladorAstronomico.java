
public class SimuladorAstronomico {
    public static void main(String[] args) {

        CuerpoCeleste planeta1 = new CuerpoCeleste();
        planeta1.setNombre("Tidally Locked Exoplanet");
        planeta1.setMasaKg(6.0e24);
        planeta1.setRadioKm(6500);
        planeta1.setDistanciaSol(100);
        planeta1.setCantidadSatelites(2);


        CuerpoCeleste planeta2 = new CuerpoCeleste("Gliese 581g", 1.7e25, 9000);
        planeta2.setDistanciaSol(30);
        planeta2.setCantidadSatelites(1);

        CuerpoCeleste planeta3 = new CuerpoCeleste("Kepler-186f", 7.0e24,
                7200, 56, 0);
        System.out.println("PRUEBA DE VALIDACIONES");
        planeta1.setMasaKg(-777);

        planeta1.imprimirReporte();
        planeta2.imprimirReporte();
        planeta3.imprimirReporte();

        System.out.println("ANALISIS DE HABITABILIDAD");
        System.out.println("Planeta 1: " + planeta1.esHabitable(25));
        System.out.println("Planeta 2: " + planeta2.esHabitable(80));
        System.out.println("Planeta 3: " + planeta3.esHabitable(15));

        System.out.println("CALCULOS DEL PLANETA 3");
        System.out.println("Volumen: " + planeta3.calcularVolumen());
        System.out.println("Densidad: " + planeta3.calcularDensidad());
    }
}
