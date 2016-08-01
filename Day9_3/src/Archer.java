/**
 * Created by tranh on 22-Jul-16.
 */
public class Archer extends Hero{
    Weapon weapon=new Weapon();
    Armors armors=new Armors();

    @Override
    protected int fight() {
        return this.mAttack;
    }



    protected void setfight() {

        if (armors.getName().equals("Leather")) {
            this.mDefense=mLevel+armors.getLevel();
            mDexterity+=1;
        }
        else
            this.mDefense=mLevel;
        if (weapon.getName().equals("Bow")) {
            mAttack+=1;
            this.mAttack=mLevel+weapon.getLevel();
        }
        else
            this.mAttack=mLevel;
        if (armors.getName().equals("Leather")&&weapon.getName().equals("Bow"))
        {
            this.mAttack=mLevel+mWeapon+mDexterity;
            this.mDefense=mLevel+mArmor+mDexterity;
        }

    }
    public String tauntLine() {
        return "Aim twice, shoot once";
    }

    public Archer(String mName, int mLevel, int mStrength, int mDexterity, int mIntelligence, int mAttack, int mDefense, int mWeapon, int mArmor, int mHp) {
        super(mName, mLevel, mStrength, mDexterity, mIntelligence, mAttack, mDefense, mWeapon, mArmor, mHp);
    }

}
