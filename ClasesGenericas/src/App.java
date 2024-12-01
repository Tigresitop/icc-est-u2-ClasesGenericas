public class App {
    public static void main(String[] args) throws Exception {
        
        // Usando Caja con tipo String
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Hola mundo");
        String contenido = cajaString.sacarAlgo();

        System.out.println("El contenido en tipo String es: " + contenido);
        System.out.println("================================================================================");

        //Usando caja con un tipo Interger
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.ponerAlgo(23);
        Integer numero = cajaInt.sacarAlgo();

        System.out.println("El contenido en tipo Integer es: " + numero);
        System.out.println("================================================================================");

        //Usando caja con un tipo Double
        Caja<Double> cajaDouble = new Caja<>();
        cajaDouble.ponerAlgo(15.5);
        Double numeroDouble = cajaDouble.sacarAlgo();

        System.out.println("El contenido en tipo Double es: " + numeroDouble);
        



    }
}
