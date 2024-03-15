import java.util.ArrayList;
public class Main
{
    public static void main(String args[])
    {
        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Ram");
        arrayList1.add("Sam");
        arrayList1.add("Charry");
        System.out.println("ArrayList 1:"+arrayList1);
        ArrayList<String>ArrayList2=new ArrayList<String>();
        ArrayList2.add("Amer");
        ArrayList2.add("Aber");
        System.out.println("ArrayList2:"+ArrayList2);
        arrayList1.addAll(ArrayList2);
        System.out.println("After addingList2 collection elements to the arrayList1 collection");
        System.out.println("arrayList1:"+arrayList1);
    
    }
}

