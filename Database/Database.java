public class Database implements IDatabase {
    @Override
    public void add() {
        System.out.println("Veritabanına veri eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Veritananından veri silindi");

    }
}
