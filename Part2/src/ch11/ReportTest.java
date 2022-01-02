package ch11;

public class ReportTest {
    public static void main(String[] args) {
        Report builder = new Report();
        String report = builder.getReport();

        System.out.println(report);
    }
}
