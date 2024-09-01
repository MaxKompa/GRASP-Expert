package app;

public class Main {
    public static void main(String[] args) {

        User user = new User("Вільгельм Букенгемов");

        Address address = new Address("ал.Незалежності 36", "Познань", "61-714");

        user.setAddress(address);

        System.out.println("Адрес користувача: " + user.getAddress());
    }
}

