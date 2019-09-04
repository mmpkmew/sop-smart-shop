package com.lab01.lab01;

public class Bun {
    private static final String[] TYPE_BUN = new String[] {
            "icing",
            "cinnamon",
            "cream",
            "hot dog",
            "ham and egg",
            "honey",
            "chocolate",
            "garlic"
    };
    private int num;
    private String list;

    public Bun(int list){
        this.num = list;
        this.list = getListName(list);
    }

    public int getNum() {
        return num;
    }

    public String getList() {
        return list;
    }

    private static String getListName(int num) {
        return Bun.TYPE_BUN[num];
    }

    public void setList(int list) {
        if (list < 0 || list >= Bun.TYPE_BUN.length) {
            this.num = 0;
            this.list = getListName(0);
        } else {
            this.num = list;
            this.list = getListName(list);
        }
    }
}
