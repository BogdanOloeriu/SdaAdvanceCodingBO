package design.patterns.builder.ex1;

public class Main {

    public static void main(String[] args) {


        User user1 = new User.UserBuilder("First Name1","Last Name1")
                .age(30)
                .address("Pacurari Street")
                .build();
        System.out.println(user1.toString());
    }
}
