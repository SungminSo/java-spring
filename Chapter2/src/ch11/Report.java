package ch11;

public class Report {
    // StringBuffer: String을 쭉 이어서 쓰는것보다('+'로) 메모리 오버헤드가 작은, StringBuffer 클래스 사용
    // 또는 StringBuilder라는 클래스가 많이 사용됨
    StringBuffer buffer = new StringBuffer();

    private final String line = "======================================\n";
    private final String title = "이름\t    주소 \t\t    전화번호  \n";

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
