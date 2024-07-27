package kg.geeks.game.players;

public class Witcher extends Hero {

    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.GIVE_LIFE);

    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes){
            if (hero.getHealth() <= 0){
                if(this.getHealth() > 0){
                    hero.setHealth(hero.getHealth() + this.getHealth());
                    }
                }
            }
        }

    }

