/**
 * Created by Antony Bolotin on 15.06.2018
 * @author AntBolotin
 */

import present.Lollipop;
import present.Marshmallow;
import present.Present;

public class Base {

    public static void main(String[] args){
        Lollipop lol1 = new Lollipop("Sweet Dreams", 10.00, 19.95, "Sugar lol");
        Marshmallow mar1 = new Marshmallow("Sweet Dreams", 15.5, 30.00, 2000.00);
        Present [] box = {lol1,mar1};
        double w = lol1.weight + mar1.weight;
        double p = lol1.price + mar1.price;
        for (Present somePresent: box) {
            System.out.println(somePresent.toString());


        }
        System.out.println("Общая стоимость подарка: " + p);
        System.out.println("Общий вес подарка: " + w);

    }
}
