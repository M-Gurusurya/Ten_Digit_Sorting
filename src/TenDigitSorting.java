import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class TenDigitSorting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            al.add(scanner.next());
        }
        findTenSort(al);
    }
    public static void findTenSort(ArrayList<String> al)
    {
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                {
                    return 1;
                }
                if(o1.charAt(0)==o2.charAt(0))
                {
                    return o1.compareTo(o2)>0 ? -1 : 1;
                }
                return -1;
            }
        });
        for(int i=0;i< al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
