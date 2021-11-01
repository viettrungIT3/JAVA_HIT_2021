package Bai_3;

public class Guns {
    private String weaponName;
    private int ammoNumber;

    public Guns() {
    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public void Load(int x) {
        ammoNumber += x;
    }

    public void Shoot( int x) {
        ammoNumber -= x;
        if (ammoNumber <= 0) {
            ammoNumber = 0;
//            System.out.println("Hết đạm");
        }
    }
}
