package ro.sda.academy.advance.coding.collection.ex13;

public class Main {

    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(3);

        weaponMagazine.loadBullet("1");
        weaponMagazine.loadBullet("2");
        weaponMagazine.loadBullet("2");

        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();


    }
}
