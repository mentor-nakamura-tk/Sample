
public class TestClass {
    public String message = null;

    public TestClass() {

    }

    public TestClass(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
        System.out.println(message);
    }
}
