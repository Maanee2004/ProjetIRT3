public class Main {
    public static void main(String[] args) {
        Livre l = new Livre("MAIMOUNA", "ABDOULAYE SADJI");
        System.out.println(l);
        l.emprunter();
        System.out.println(l);
    }
}
