package cn.running4light;

import cn.running4light.entity.Obj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Obj> list = new ArrayList<Obj>();
        initData(list);

    }

    private static void initData(List<Obj> list) {
        for (int i = 0; i < 20; i++) {
            list.add(new Obj(i, "str"+i, i+0.2, new BigDecimal(i+"")));
        }
    }
}
