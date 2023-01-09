package practice.exercises.ex49;

import java.util.LinkedList;

public class WeaponMagazine {

    private Integer maxSize;
    private final LinkedList<String> weaponMagazine = new LinkedList<>();

    public WeaponMagazine(Integer maxSize) {
        this.maxSize = maxSize;
    }


    public void loadBullet(String bullet){
        if(weaponMagazine.size() < maxSize){
            weaponMagazine.addLast(bullet);
        }else{
            System.out.println("Weapon Magazine is full!");
        }
    }

    public Boolean isLoaded(){
        return !weaponMagazine.isEmpty();
    }

    public void shot(){
        if(!weaponMagazine.isEmpty()){
            System.out.println("Bullet removed!");
            weaponMagazine.removeFirst();
        }else{
            System.err.println("Weapon Magazine is empty! You need to reload!");
        }
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public LinkedList<String> getWeaponMagazine() {
        return weaponMagazine;
    }

    @Override
    public String toString() {
        return "WeaponMagazine{" +
                "maxSize=" + maxSize +
                ", weaponMagazine=" + weaponMagazine +
                '}';
    }
}
