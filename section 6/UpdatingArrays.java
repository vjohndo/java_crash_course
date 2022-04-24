import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espress", "Iced Coffee", "Machiato"};
        menu[2] = "Juice";
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        newMenu[3] = "Blend";
        newMenu[4] = "Roast";

        System.out.println(Arrays.toString(newMenu));

    }    
}
