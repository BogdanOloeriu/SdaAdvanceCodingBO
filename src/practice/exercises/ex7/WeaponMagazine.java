package practice.exercises.ex7;

import ro.sda.academy.advance.coding.oop.ex6.Basket;

import java.util.LinkedList;

public class WeaponMagazine {

    private final int maxSize;
    private final LinkedList<String> bullets = new LinkedList<>();

    public WeaponMagazine(int maxSize) {
        this.maxSize = maxSize;
    }

    public void loadBullet(String bullet){
        if(bullets.size() < maxSize){
            bullets.addLast(bullet);
        }else {
            throw new RuntimeException("Weapon Magazine is full!" + bullets.size());
        }
    }

    public Boolean isLoaded(){
        return !bullets.isEmpty();
    }

    public void shot(){
        if(isLoaded()){
            System.out.println("Bullet shot: "+ bullets.removeFirst());
        }else{
            System.out.println("Empty magazine!");
        }
    }


}
