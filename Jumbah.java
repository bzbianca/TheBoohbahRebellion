public class Jumbah extends SupremeBoohbah{

    public Jumbah(){
        super();
        this.name = "Jumbah";
        System.out.println(name + " refused and decided to not show.");
    }

    @Override
    public void command(){
        super.command(name + " threatens and calls the Supreme names");
    }
}
