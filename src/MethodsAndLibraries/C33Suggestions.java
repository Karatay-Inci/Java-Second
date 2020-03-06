package MethodsAndLibraries;

public class C33Suggestions {
    public static void main(String[] args) {
        pickMeFoodRandomly();
        decideCloth();

    }
    public static void pickMeFoodRandomly() {
        int choice = (int) (Math.random() * 3) + 1;

        if (choice == 1) {
            System.out.println("Drink Soup");
        } else if (choice == 2) {
            System.out.println("Eat Hamburger");
        } else {
            System.out.println("Enjoy Salad");
        }
    }
        public static void decideCloth(){
            int decide=(int)(Math.random()*3)+1;

            if (decide==1){
                System.out.println("Red Shirt");
            }
            else if (decide==2){
                System.out.println("Blue Jean");
            }
            else {
                System.out.println("White Hat");
            }
        }
    }

