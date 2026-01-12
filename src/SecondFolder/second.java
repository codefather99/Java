package SecondFolder;

class Human {

    // Fields
    public int age;
    public String name;
    private static int nom = 0;

    public static int getNom() {
        return nom;
    }

    public static void setNom(int nom) {
        Human.nom = nom;
    }


    // Methods
    public void changeName(String name) {
        this.name = name;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    // Constructor
    public Human (int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}

 class NewHumans {
      void main(String[] args) {

        Human henry = new Human(24, "Kamsi");

        System.out.println(henry.name);

        henry.changeAge(25);

         System.out.println(henry.age);
    }



}





