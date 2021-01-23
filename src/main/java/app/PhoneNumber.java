package app;

public class PhoneNumber {
    private final String number;

    private PhoneNumber(String number) {
        this.number = number;
    }

    public static PhoneNumber of(String number){
        if (PhoneBook.isValidPhoneNumber(number)){
            return new PhoneNumber(number);
        } else {
            return null;
        }
    }

    public String get(){
        return number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
