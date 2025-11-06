public class Humbah extends SupremeBoohbah{

    public Humbah(){
        super();
        this.name = "Humbah";
        System.out.println(name + " bowed elegantly before the Supreme.");
    }

    @Override
    public void command(){
        System.out.println(name + " follows his orders without question.");
    }
}
