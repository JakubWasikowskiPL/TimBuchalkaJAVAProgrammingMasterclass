public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Delux", "Sausage & Bacon", 19.1, "White");
//        super.addHamburgerAddition1("Chips ",2.45);
//        super.addHamburgerAddition2("Drink ",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
