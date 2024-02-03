package task4;

public class PhoneNumber {
    String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        if (checkPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\+994(?:50|51|55|70|77|10)\\d{3}\\d{2}\\d{2}")) {
            System.out.println("Nomre formati duzgundur");
            return true;
        } else {
            System.out.println("Nomre formati sehvdir");
            System.out.println("Duzgun numune: +994501234567");
            return false;
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }
}
