public class Jingbah extends SupremeBoohbah{

    public Jingbah(){
        super();
        this.name = "Jingbah";
        System.out.println(name + " plead for peace and harmony for the Boohbahs.");
    }

    @Override
    public void command(){
        System.out.println(name + " whispers: We can all get along and try again.");
    }

    public void command(String message, boolean whisper) {
        if (whisper) {
            System.out.println(name + " plead for peace and harmony for the Boohbahs.");
        } else {
            System.out.println(name + " yells: Please we must come together and make a compromise!!");
        }
    }
}
