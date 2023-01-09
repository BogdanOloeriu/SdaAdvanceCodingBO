package practice.exercises.ex49;

public class Main {

    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(3);
        weaponMagazine.loadBullet("a");
        weaponMagazine.loadBullet("a");
        weaponMagazine.loadBullet("a");

        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();

        System.out.println("---------------");
        weaponMagazine.loadBullet("b");
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
