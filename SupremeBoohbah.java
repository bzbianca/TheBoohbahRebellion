public class SupremeBoohbah {
    protected String name;

    public SupremeBoohbah() {
        this.name = "Zing Zing Zingbah";
        System.out.println("The Supreme Boohbah has awakened. Bow down and obey Zing Zing Zingbah!");
    }
    public void command() {
        System.out.println("Will they obey?");
    }
    public void command(String message) {
        System.out.println(message);
    }
    public String toString() {
        return name + " : Perform in like there is no tomorrow!";
    }
}
