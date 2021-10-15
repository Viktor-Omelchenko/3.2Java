public class Main {
    public static void main(String[] args) {
        BmiService indexMass = new BmiService();
        float results = indexMass.calculate(65.0F, 1.60F);
        if (18.5F <= results && 25.5F > results) {
            System.out.println("норма массы тела");
        }
        if (18.5F > results) {
            System.out.println("дефицит массы тела");
         }
        if (25.5F <= results) {
            System.out.println("избыток массы тела");
        }
        System.out.println(results);
    }
}