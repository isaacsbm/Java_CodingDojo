public class Mammal {
    private int energy;

    //Display Energy
    public Mammal() {
        this.energy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public void displayEnergy() {
        System.out.println("The Energy Level is " + energy);
    }
}
    //Gorilla Class

    class Gorilla extends Mammal {
        // throwSomthing - decrease energy by 5 and print a message saying it has throw something
        public void throwSomething(){
            setEnergy(getEnergy() - 5);
            System.out.println("The Gorilla threw a banana!");
        }
        //eatBananas - increase the gorilla's energy by 10 and print a message for the gorilla's success!

        public void eatBananas(){
            System.out.println("The Gorilla ate a banana!");
            setEnergy(getEnergy() + 10);
        }
        //climb - decrease the gorilla's energy by 10 and print a message indicating he has climbed a tree
        public void climb(){
            System.out.println("The Gorillia climbed a tree! He's really entertaining!");
            setEnergy(getEnergy() - 10);
        }
    }

    //Bat Class
    class Bat extends Mammal {
        public Bat() {
            setEnergy(300);
        }
        //fly  - decrease the bat's energy by 50 and indicate airborn
        public void fly(){
            System.out.println("The Bat has taken off!");
            setEnergy(getEnergy() - 50);
        }
        //eatHumans - increaset the bat's energy by 25 and message
        public void eatHumans(){
            System.out.println("The Bat has bitten a human! It's a vampire! Oh no!");
            setEnergy(getEnergy() + 25);
        }
        //attackTown - decrease teh bat's energy by 100 and message
        public void attackTown(){
            System.out.println("The Bat/Vampire has attacked the town! Run!");
            setEnergy(getEnergy() - 100);
        }
    }