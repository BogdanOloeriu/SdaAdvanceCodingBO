package practice.exercises.ex7;

public class Main {

    public static void main(String[] args) {


        WeaponMagazine weaponMagazine =new WeaponMagazine(5);
        weaponMagazine.loadBullet("bullet");
        weaponMagazine.loadBullet("bullet");
        weaponMagazine.loadBullet("bullet");
        weaponMagazine.loadBullet("bullet");
        weaponMagazine.loadBullet("bullet");
        System.out.println(weaponMagazine.isLoaded());

        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
