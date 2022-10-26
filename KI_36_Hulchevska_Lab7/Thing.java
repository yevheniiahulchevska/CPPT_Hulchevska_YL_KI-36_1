package KI_36_Hulchevska_Lab7;
//Клас моделює предмет в антресолі без кольору

class Thing implements Things
{
    private String Thing;
    private int ThingLength;
    private int ThingWidth;
    private int ThingHeight;

    public Thing(String Thing, int ThingLength, int ThingWidth, int ThingHeight){ // конструктор
        this.Thing = Thing;
        this.ThingLength = ThingLength;
        this.ThingWidth = ThingWidth;
        this.ThingHeight = ThingHeight;
    }


    // Метод повертає предмет
    public String get_Thing(){
        return Thing;
    }

    // Метод встановлює значення поля Thing
    public void set_Thing(String Th){
        this.Thing = Th;
    }

    // Метод повертає довжину предмета
    public int get_ThingLength(){
        return ThingLength;
    }

    // Метод встановлює значення поля ThingLength
    public void set_ThingLength(int TL){
        this.ThingLength = TL;
    }

    // Метод повертає ширину предмета
    public int get_ThingWidth(){
        return ThingWidth;
    }

    // Метод встановлює значення поля ThingWidth
    public void set_ThingWidth(int TW){
        this.ThingWidth = TW;
    }

    // Метод повертає висоту предмета
    public int get_ThingHeight(){
        return ThingHeight;
    }

    // Метод встановлює значення поля ThingHeight
    public void set_ThingHeight(int TH){
        this.ThingHeight = TH;
    }

    // Метод повертає об'єм предмету

    public int get_ThingCapacity(){
        return ThingHeight*ThingLength*ThingWidth;
    }

    public int compareTo(Things p){
        Integer s = get_ThingCapacity();
        return s.compareTo(p.get_ThingCapacity());
    }

    // Вивід інформації про предмет

    public void print(){
        System.out.print("Thing: " + Thing + ", Size(LHW): " + ThingLength + " " + ThingHeight + " " + ThingWidth +"\n");
    }
}

