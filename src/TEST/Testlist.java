package TEST;

import java.util.ArrayList;
import java.util.List;
/*
list:有序重复性
 */
public class Testlist {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("hechixueyuan");
        list.add(555.2);
        list.add(true);


        System.out.println("当前list的数量："+list.size());

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
