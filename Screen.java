public class Screen implements SelectTable, UpdateTable{
    //Будуємо систему відеоспостереження. Створюємо два інтерфейси SelectTable та UpdateTable.
    // Створимо у них методи refresh та onSelect (оберіть який метод в якому інтерфейсі). Реалізуємо ці
    // інтерфейси у класі Screen

    static class Screen1 {
        public void Screen1() {
            Screen screen = new Screen();
            screen.onSelect();
            screen.refresh();
        }
    }

    public static void main(String[] args) {
        Screen1 screen1 = new Screen1();
        screen1.Screen1();
    }

    @Override
    public void onSelect() {
        System.out.println("1");
    }

    @Override
    public void refresh() {
        System.out.println("2");
    }
}
