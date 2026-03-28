public class distanciasuperficie {
    public static void main(String[] args) {

        double r = 6371.01; // raio da Terra

        double x1 = 25; // latitude do primeiro ponto
        double y1 = 35; // longitude do primeiro ponto
        double x2 = 35.5; // latitude do segundo ponto
        double y2 = 25.5; // longitude do segundo ponto

        x1 = Math.toRadians(x1); // convertendo para radianos
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double d = r * Math.acos(
                Math.sin(x1) * Math.sin(x2) + // fórmula de Haversine
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2) // diferença de longitude
        );

        System.out.println("A distancia entre esses pontos e: " + d + " km");
    }
}