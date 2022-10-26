package KI_36_Hulchevska_Lab7;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Entresol <? super Things> MyEntresol = new Entresol<Things>(); // створення нового обєкту калсу

        MyEntresol.AddData(new ProThing("Manicure Box", 65, 30, 13, "white"));
        MyEntresol.AddData(new Thing("Docunents", 34, 35, 5));
        MyEntresol.AddData(new Thing("Gloves", 19, 8, 6));
        MyEntresol.AddData(new Thing("Ruler", 20, 1, 1));
        MyEntresol.AddData(new ProThing("Headphone Box", 20, 14, 6, "black"));

        Things res = MyEntresol.findMin();
        System.out.print("The thing with the smallest capacity: \n");
        res.print();
        System.out.print("The capacity is: "+res.get_ThingCapacity()+"m^3");

    }
}
