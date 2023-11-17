public class BeerLover implements  Drink, Alcohol{
    public static void main(String[] args) {
        //Багато програмування не буває… А от у ситуації «багато пива» бувають наслідки «пора додому» чи
        // «спати на підлозі». У задачі ви отримаєте два інтерфейси Drink та Alcohol, і лише один з них
        // необхідно буде реалізувати у класі BeerLover. У цих двох інтерфейсах мають бути реалізовані такі
        // методи askMore, sayThankYou, isReadyToGoHome, sleepOnTheFloor. Подумайте які методи якому із
        // інтерфейсів мають належати. Інтерфейси можуть успадковуватись один від одного.

        BeerLover beerLover = new BeerLover();
        beerLover.askMore();
        beerLover.sleepOnTheFloor();
        beerLover.sayThankYou();
        beerLover.isReadyToGoHome();
    }

    @Override
    public void askMore() {
        System.out.println("Ще бокал пива!");
    }

    @Override
    public void sleepOnTheFloor() {
        System.out.println("Я сплю на підлозі");
    }

    @Override
    public void sayThankYou() {
        System.out.println("I say thank you");
    }
    @Override
    public void isReadyToGoHome() {
        System.out.println("I am ready to go home and sleep in the bed");
    }
}
