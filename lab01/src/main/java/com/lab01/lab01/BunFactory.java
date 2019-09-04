package com.lab01.lab01;

public class BunFactory {
    public static final BunMenu[] BUN_MENUS = new BunMenu[]{
            new BunMenu("Belgian buns", "a sweet bun containing sultanas and usually topped with fondant icing and half a glace cherry.",new Bun[] {
                    new Bun(1),
                    new Bun(2),
                    new Bun(3)
            }, 20),
            new BunMenu("Belgian buns", "Belgian buns",new Bun[] {
                    new Bun(4),
                    new Bun(5),
                    new Bun(6)
            }, 25),
            new BunMenu("Belgian buns", "Belgian buns",new Bun[] {
                    new Bun(7)
            }, 30),
    };
    public static BunMenu getBunMenu(int numBun) {
        return BUN_MENUS[numBun];
    }

    public static BunMenu[] getBunMenusList(){
        return BUN_MENUS;
    }


}
