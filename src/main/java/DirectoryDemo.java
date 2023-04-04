public class DirectoryDemo {


    public static void main (String [] args) {

        int older = 0;
        int sumAge = 0;
        int sexMale = 0;

        Directory MariyaZakharova = new Directory("Mariya", "Zakharova", 27, sex.female, "sport", true, true);
        Directory AlexPetrov = new Directory("Alex", "Petrov", 35, sex.male, "music", false, true);
        Directory ValeriyGolybev = new Directory("Valeriy", "Golybev", 69, sex.male, "sport", false, false);

        older += MariyaZakharova.ifOlder();
        older += AlexPetrov.ifOlder();
        older += ValeriyGolybev.ifOlder();

        sexMale += MariyaZakharova.ifMale();
        sexMale += AlexPetrov.ifMale();
        sexMale += ValeriyGolybev.ifMale();

        sumAge = MariyaZakharova.ageReturn() + AlexPetrov.ageReturn() + ValeriyGolybev.ageReturn();

        MariyaZakharova.printInfo();
        AlexPetrov.printInfo();
        ValeriyGolybev.printInfo();

        System.out.println("Количество людей старше 20: " + older);
        System.out.println("Сумма всех возрастов: " + sumAge);
        System.out.println("Количество мужчин в коллективе: " + sexMale);

        MariyaZakharova.sexChange();

        MariyaZakharova.printInfo();



    }
}
