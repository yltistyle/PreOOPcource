package edu.penzgtu.oop.task21;

public class Email {
    public static void main( String[] args ){
        String email = "VasiliyTeam1@mail.ru";
        System.out.printf("email: %s\nvalid?: %s", email, isValidEmail(email));
    }
    static boolean isValidEmail(String email) {
        return email.matches("[\\w\\d]{6,30}@\\w{2,63}\\.\\w{2,3}");
    }
}
