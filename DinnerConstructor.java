import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    GenerationRandomDinner rd = new GenerationRandomDinner();
    HashMap<String, ArrayList<String>> menu;
    ArrayList<String>dish;
        DinnerConstructor(){
        menu = new HashMap<>();
        dish = new ArrayList<>();

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
    int randomDiner(int size){
        Random random= new Random();
        int randomNumber = random.nextInt(size);
    return randomNumber;
    }

    void GeneretDinner(){
          menu.keySet();

    }



}
