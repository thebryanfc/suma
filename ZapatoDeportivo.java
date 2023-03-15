
    public class ZapatoDeportivo{
        // Atributos
        private String marca;
        private String modelo;
        private String color;
        private int talla;
        private String genero;
        private boolean estaDisponible;

        // Constructor
        public ZapatoDeportivo(String marca, String modelo, String color, int talla, String genero, boolean estaDisponible) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.talla = talla;
            this.genero = genero;
            this.estaDisponible = estaDisponible;
        }

        // Getters y Setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getTalla() {
            return talla;
        }

        public void setTalla(int talla) {
            this.talla = talla;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public boolean getEstaDisponible() {
            return estaDisponible;
        }

        public void setEstaDisponible(boolean estaDisponible) {
            this.estaDisponible = estaDisponible;
        }

        // Otros métodos
        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Color: " + color);
            System.out.println("Talla: " + talla);
            System.out.println("Género: " + genero);
            System.out.println("Disponible: " + estaDisponible);
        }

        public void usar() {
            System.out.println("Los zapatos deportivos " + marca + " " + modelo + " han sido usados.");
        }

        // Método main para probar la clase
        public static void main(String[] args) {

            ZapatoDeportivo zapato1 = new ZapatoDeportivo("Nike", "Air Max", "Blanco", 9, "Hombre", true);


            zapato1.mostrarInfo();


            zapato1.usar();


            zapato1.setEstaDisponible(false);

            // Mostrar la información actualizada del objeto
            zapato1.mostrarInfo();
        }
    }



