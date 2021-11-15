package com.pb.konstantinova.hw7;

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirt= new Tshirt();
        tshirt.size=Size.L;
        tshirt.price=700;
        tshirt.color=" чорный";

        Pants pants= new Pants();
        pants.size=Size.S;
        pants.price=900;
        pants.color=" синий";

        Skirt skirt= new Skirt();
        skirt.size=Size.M;
        skirt.price=750;
        skirt.color=" розовый";

        Tie tie= new Tie();
        tie.size=Size.XS;
        tie.price=550;
        tie.color=" фиолетовый";

        Clothes[] clothes={tie,skirt,pants,tshirt};
//
        dressMan(clothes);
        dressWomen(clothes);
    }
    public static void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда: ");
        for (Clothes clothe:clothes)
            if (clothe instanceof ManClothes){
                System.out.println(clothe.getClass().getSimpleName()+": "+clothe.size.toString()+clothe.color+": "+clothe.price+" кредитов");
            }

    }
    public static void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда: ");
        for (Clothes clothe:clothes)
            if (clothe instanceof WomenClothes){
                System.out.println(clothe.getClass().getSimpleName()+": "+clothe.size.toString()+clothe.color+": "+clothe.price+" кредитов");
            }
    }
}
