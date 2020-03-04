import bean.Stduent;
import util.MapUtils;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        Stduent stduent = new Stduent();
        stduent.setId("1");
        stduent.setName("abc");

        List<Stduent> list = new ArrayList<Stduent>();
        list.add(stduent);
        stduent.setList(list);
        stduent.setStduent(stduent);
        for (int j = 0; j < 100; j++) {
            long a = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
//                Map map = JSONObject.parseObject(JSONObject.toJSONString(stduent), Map.class);
            Map map = MapUtils.objToMap(stduent);
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) iterator.next();
//                System.out.println(entry.getKey() + "   " + entry.getValue());
                }
            }
            long b = System.currentTimeMillis();
            System.out.println(b - a);
        }
    }





}
