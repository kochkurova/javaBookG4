public class Directory {
    String name;
    String surname;
    int age;
    sex sex;
    String hobby;
    boolean married;
    boolean haveСhildren;

    Directory (String conName, String conSurname, int conAge, sex conSex, String conHobby, boolean conMarried, boolean conHaveChildren) {
        name = conName;
        surname = conSurname;
        age = conAge;
        sex = conSex;
        hobby = conHobby;
        married = conMarried;
        haveСhildren = conHaveChildren;

    }

    public int ifOlder () {

        if (age > 20)
            return 1;

        else
            return 0;
    }

    public int ifMale () {
        if (sex == sex.male)
            return 1;
        return 0;
    }

    public void sexChange () {
        if (sex == sex.male)
            sex = sex.female;

        else if (sex == sex.female)
            sex = sex.male;


    }

    public int ageReturn () {
        return age;
    }

    public void printInfo () {

        System.out.println(name + " " + surname);
        System.out.println("--------------------");
        System.out.println("Возраст: " + age);

        if (sex == sex.male)

            System.out.println("пол: мужской");

        else if (sex == sex.female)

            System.out.println("пол: женский");
        else

            System.out.println("пол: другой");

        System.out.println("--------------------");

        if (married)

            System.out.println("состоит в браке");

        else

            System.out.println("не состоит в браке");

        if (haveСhildren)

            System.out.println("есть дети");

        else

            System.out.println("нет детей");

        System.out.println("--------------------");
        System.out.println("хобби: " + hobby);
        System.out.println("--------------------");

        System.out.println();

    }

}
