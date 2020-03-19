package march18Codes;

public class Interview_Test {
    public static void main(String[] args) {
        Interview myCandidate=new Interview("Esra", 100, true,25, 35, 40);
        System.out.println(myCandidate.toString());
        System.out.println(myCandidate.decision());
        System.out.println(myCandidate.calculate_Score());
    }
}
