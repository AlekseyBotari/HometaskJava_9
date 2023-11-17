public class Pinguin implements Walk{
    public static void main(String[] args) {
        //Нам належить зв'язати інтерфейси «літати», «бігти» та «плавати» з класами «Людина», «Качка»,
        // «Пінгвін» та «Літак».
        Pinguin pinguin = new Pinguin();
        pinguin.canWalk();
    }

    @Override
    public void canWalk() {
        System.out.println("Улыбаемся и машем!");
    }
}
