public class MaquinaCafe {
    public String servirCafe(String tipo, int azucar) {
        switch (tipo) {
            case "pequeno": return "Sirviendo café de 3oz con " + azucar + " azúcar.";
            case "mediano": return "Sirviendo café de 5oz con " + azucar + " azúcar.";
            case "grande":  return "Sirviendo café de 7oz con " + azucar + " azúcar.";
            default: return "Tamaño no válido.";
        }
    }
}
