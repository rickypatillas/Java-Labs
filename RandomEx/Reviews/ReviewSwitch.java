package RandomEx.Reviews;

public class ReviewSwitch {
    public static void main(String[] args) {


        int pumpkin = 3;
        switch (pumpkin) {
            case 0:
                System.out.println("this is zero");
                break;

            case 1:
                System.out.println("this is one");
                break;

            case 2:
                System.out.println("este es 2");
                break;

            case 3:
                System.out.println("es tres");
                break;

            default:
                System.out.println("oh no baby what is u doin'");
        }
        System.out.println("..................");

        System.out.println("Let's learn spanish");
        String str = "banana";
        switch (str) {
            case "coconut":
                System.out.println(str + " es el coco");
                break;
            case "banana":
                System.out.println(str + " = platano");
                break;
            case "apple":
                System.out.println(str + " = manzana");
                break;
            case "peach":
                System.out.println(str + " = durazno");
                break;
            default:
                System.out.println("That fruit doesn't exist in spanish");
        }

        System.out.println("...............................");

        int cadensinput = 15;
        String position;

        switch (cadensinput) {
            case 15:
                position = "oro";
                System.out.println(position);
                break;
            case 10:
                position = "silver";
                System.out.println(position);
                break;
            case 5:
                position = "bronze";
                System.out.println(position);
                break;
            default:
                System.out.println("You suck");
                break;
        }
        System.out.println(".............................");


        System.out.println("How many eggs do you eat daily?");
        int numEggs = 12;
        String canEat;
        System.out.println(numEggs);

        switch (numEggs){
            case 2:
                canEat = "Solid breakfast";
                System.out.println(canEat);
                break;
            case 6:
                canEat = "Easy there champ";
                System.out.println(canEat);
                break;
            case 12:
                canEat = "wow, that cholesterol might get dangerous";
                System.out.println(canEat);
                break;
            case 24:
                canEat = "You dead";
                System.out.println(canEat);
                break;
            default:
                canEat = "eggs give you protein";
                break;
        }
    }
}
