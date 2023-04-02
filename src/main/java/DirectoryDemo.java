public class DirectoryDemo {

    public static void main (String [] args) {

        int older = 0;
        int sumAge = 0;

        Directory MariyaZakharova = new Directory();
        Directory AlexPetrov = new Directory();
        Directory ValeriyGolybev = new Directory();

        MariyaZakharova.identity("Mariya", "Zakharova", 27, sex.female, "Sport", true, true);
        AlexPetrov.identity("Alex", "Petrov", 33, sex.other, "Language", false, false);
        ValeriyGolybev.identity("Valery", "Golubev", 44, sex.male, "Fishing", false, true);

        older += MariyaZakharova.ifOlder();
        older += AlexPetrov.ifOlder();
        older += ValeriyGolybev.ifOlder();

        sumAge = MariyaZakharova.ageReturn() + AlexPetrov.ageReturn() + ValeriyGolybev.ageReturn();

        System.out.println("Количество людей старше 20: " + older);
        System.out.println("Сумма всех возрастов: " + sumAge);

        MariyaZakharova.printInfo();
        AlexPetrov.printInfo();
        ValeriyGolybev.printInfo();
    }
}
