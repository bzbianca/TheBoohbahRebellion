public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] supremeBoohbah = { new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};
        System.out.println("\n--- Boohbah Rebellion Begins ---");
        for (SupremeBoohbah boohbah : supremeBoohbah) {
            boohbah.command();
        }
        System.out.println("\n--- Overloaded Commands ---");
        supremeBoohbah[0].command("Humbah brings gifts and offerings to the Supreme with elegant dancing.");
        supremeBoohbah[3].command((Jingbah), false)(Jingbah);
    }

}
