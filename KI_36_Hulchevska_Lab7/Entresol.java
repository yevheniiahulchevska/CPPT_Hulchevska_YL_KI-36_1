package KI_36_Hulchevska_Lab7;
import java.util.ArrayList;
class Entresol <T extends Things> {  //параметризований клас

    private ArrayList<T> arr;

    public Entresol(){  //конструктор
        arr = new ArrayList<T>();
    }

    public T findMin(){
        if (!arr.isEmpty())
        {
            T min = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(min) < 0 )
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

    public void AddData(T data){
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }
}
