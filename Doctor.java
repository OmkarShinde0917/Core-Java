public class Doctor { //Parent Class
    public void surgery() {
        System.out.println("Doctor doing surgery");
    }

}

 class Surgeon extends Doctor { //Child Class inherit from Doctor class
    public void catractSurgeon() { // method
        System.out.println("Doctor is Cataract surgeon");
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.surgery(); //inherit from doctor class
        surgeon.catractSurgeon();
    }
}


class Nurse extends Doctor { //Child Class inherit from Doctor class
    public void treatment() { //method
        System.out.println("Nurse helping doctor");
    }

    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.surgery(); //inherit from doctor class
        nurse.treatment();
    }
}