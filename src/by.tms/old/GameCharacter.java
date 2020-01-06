package by.tms.old;

public class GameCharacter {

    public static void main(String[] args) {
        GameCharacter mage = new GameCharacter("Hero", "Mage" ,60, "Human", "Alliance");
        GameCharacter warrior = new GameCharacter("Hero2", "Warrior" ,60, "Troll", "Horde");
        GameCharacter warrior2 = new GameCharacter("Hero3", "Troll", "Horde");
        GameCharacter mage2 = new GameCharacter("Hero4", "Elf", "Alliance");

        System.out.println(mage.equals(warrior));
        System.out.println(warrior.equals(warrior2));
        System.out.println(mage.equals(mage2));

    }

    String name;
    String spec;
    int level;
    String race;
    String faction;

    public GameCharacter(String name, String spec, int level, String race, String faction) {
        this.name = name;
        this.spec = spec;
        this.level = level;
        this.race = race;
        this.faction = faction;
    }

    public GameCharacter(String name, String race, String faction){
        this.name = name;
        this.race = race;
        this.faction = faction;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        GameCharacter ch = (GameCharacter) obj;
        return level == ch.level ||
                this.faction.equals(ch.faction) && this.race.equals(ch.race)/*Objects.equals(faction, ch.faction)*/;
    }
}
