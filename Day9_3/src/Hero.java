/**
 * Created by tranh on 22-Jul-16.
 */
public abstract class Hero {
    protected String mName;
    protected int mLevel;
    protected int mStrength;
    protected int mDexterity;
    protected int mIntelligence;
    protected int mAttack;
    protected int mDefense;
    protected int mWeapon;
    protected int mArmor;
    protected int mHp;

    protected String tauntLine() {
        return "I'm ready for anything";
    }

    public Hero(String mName, int mLevel, int mStrength, int mDexterity, int mIntelligence, int mAttack, int mDefense, int mWeapon, int mArmor, int mHp) {
        this.mName = mName;
        this.mLevel = mLevel;
        this.mStrength = mStrength;
        this.mDexterity = mDexterity;
        this.mIntelligence = mIntelligence;
        this.mAttack = mAttack;
        this.mDefense = mDefense;
        this.mWeapon = mWeapon;
        this.mArmor = mArmor;
        this.mHp = 100;
    }

    public Hero(String mName, int mLevel) {
        this.mName = mName;
        this.mLevel = mLevel;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmDexterity() {
        return mDexterity;
    }

    public void setmDexterity(int mDexterity) {
        this.mDexterity = mDexterity;
    }

    public int getmIntelligence() {
        return mIntelligence;
    }

    public void setmIntelligence(int mIntelligence) {
        this.mIntelligence = mIntelligence;
    }

    public int getmAttack() {
        return mAttack;
    }

    public void setmAttack(int mAttack) {
        this.mAttack = mAttack;
    }

    public int getmDefense() {
        return mDefense;
    }

    public void setmDefense(int mDefense) {
        this.mDefense = mDefense;
    }

    public int getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(int mWeapon) {
        this.mWeapon = mWeapon;
    }

    public int getmArmor() {
        return mArmor;
    }

    public void setmArmor(int mArmor) {
        this.mArmor = mArmor;
    }

    public int getmHp() {
        return mHp;
    }

    public void setmHp(int mHp) {
        this.mHp = mHp;
    }

    protected abstract int fight();

}
