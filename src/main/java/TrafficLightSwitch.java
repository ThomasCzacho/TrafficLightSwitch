import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System. in);
        String message="";
        System.out.print("Enter Traffic Light Color as a Number(Red=1 Green=2 Yellow=3) \n");
        int month = sc.nextInt();

        if (month==1){
         message="The Next Color will be Green";
        }
        else if (month==2){
            message="The Next Color will be Yellow";
        }
        else if (month==3){
            message="The Next Color will be Red";
        }
        else{
            message="Invalid Color. (Valid Colors: 1, 2, 3)";
        }

//        switch (month) {
//            case 1 : message = "The Next Color will be Green";
//                break;
//            case 2 : message = "The Next Color will be Yellow";
//                break;
//            case 3 : message = "The Next Color will be Red";
//                break;
//
//            default: message = "Invalid Color. (Valid Colors: 1, 2, 3)";
//        }
        System.out.println(message);
        sc.close();
    }
}

