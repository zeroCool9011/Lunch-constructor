import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> menu;
        DinnerConstructor(){
        menu = new HashMap<>();

    }
    void addNewDish(String dishType, String dishName) {

        if(menu.containsKey(dishType)){
            ArrayList<String> dish = menu.get(dishType);
            dish.add(dishName);

            }else {
            ArrayList<String> dish = new ArrayList<>();
            dish.add(dishName);
            menu.put(dishType,dish);

        }

        }

    void generateDishCombo(Integer numberOfCombos, String nextItem) {

        System.out.println(menu);
        //реализуйте ввод типов блюд
        while (!nextItem.isEmpty()) {

        }

        // сгенерируйте комбинации блюд и выведите на экран


    }
}
