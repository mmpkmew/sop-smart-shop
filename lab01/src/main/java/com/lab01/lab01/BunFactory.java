package com.lab01.lab01;

public class BunFactory {
    public static final BunMenu[] BUN_MENUS = new BunMenu[]{
            new BunMenu("Belgian buns", "a sweet bun containing sultanas and usually topped with fondant icing and half a glace cherry.",new Bun[] {
                    new Bun(1),
                    new Bun(2),
                    new Bun(3)
            }, 20),
            new BunMenu("Bath buns", "Belgian buns",new Bun[] {
                    new Bun(4),
            }, 25),
            new BunMenu("Saffron buns", "Belgian buns",new Bun[] {
                    new Bun(5),
                    new Bun(6),
                    new Bun(7)
            }, 30),
            new BunMenu("Hot cross bun","usually made with fruit, marked with a cross on the top, and traditionally eaten on Good Friday",new Bun[]{
                    new Bun(8)
            }, 35),
    };
    public static BunMenu getBunMenu(int numBun) {
        return BUN_MENUS[numBun];
    }

    public static BunMenu[] getBunMenusList(){
        return BUN_MENUS;
    }


}
