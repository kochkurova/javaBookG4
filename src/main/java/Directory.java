public class Directory {
    String name;
    String surname;
    int age;
    sex sex;
    String hobby;
    boolean married;
    boolean haveСhildren;

    public void identity (String idenName, String idenSurname, int idenAge, sex idenSex, String idenHobby, boolean idenMarried, boolean idenHaveChildren) {
        name = idenName;
        surname = idenSurname;
        age = idenAge;
        sex = idenSex;
        hobby = idenHobby;
        married = idenMarried;
        haveСhildren = idenHaveChildren;

    }

    public int ifOlder () {

        if (age > 20)
            return 1;

        else
            return 0;
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
