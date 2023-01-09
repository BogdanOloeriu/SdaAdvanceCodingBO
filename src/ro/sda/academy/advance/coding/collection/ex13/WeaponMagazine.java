package ro.sda.academy.advance.coding.collection.ex13;

import java.util.LinkedList;

/**
 * Ex 8
 *         Create a class imitating a weapon magazine.
 *         The class should be able to define the size of the magazine using the constructor.
 *         Implement the methods:
 *         loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than
 *         the capacity of the magazine
 *         isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 *         shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one,
 *         loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */

public class WeaponMagazine {

    private final LinkedList<String> magazine = new LinkedList<>();
    private int maxSize;

    public WeaponMagazine(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void loadBullet(String bullet){
        if(magazine.size() < maxSize){
            magazine.addLast(bullet);
        }else {
            throw new RuntimeException("Weapon Magazine is full!");
        }
    }

    public Boolean isLoaded(){
        return !magazine.isEmpty();
    }

    public void shot(){
        if(isLoaded()){
            magazine.removeFirst();
        }else{
            System.out.println("Magazine is empty");
        }
    }

}
