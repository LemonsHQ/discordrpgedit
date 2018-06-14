package models;

public class Item {
    public enum Type {WEAPON, SHIELD, BODY, HELMET, GLOVES, BOOTS, LEG, CONSUMABLE};
    public enum Rarity{COMMON, RARE, EPIC, LEGENDARY, MYTH};

    private String name;
    private int statValue;
    private int sellValue;
    private Type itemType;
    private Rarity rarity;

    public Item(String name, int statValue, Type itemType, Rarity rarity, int sellValue) {
        this.name = name;
        this.statValue = statValue;
        this.itemType = itemType;
        this.rarity = rarity;
        this.sellValue = sellValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatValue() {
        return statValue;
    }

    public void setStatValue(int statValue) {
        this.statValue = statValue;
    }

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }

    public double getDropRate(){
        switch(getRarity()){
            case COMMON:
                return .15;
            case RARE:
                return .05;
             case EPIC:
                return .01;
            case LEGENDARY:
                return .005;
            case MYTH:
                return 0;
        }
        return 0;
    }
}