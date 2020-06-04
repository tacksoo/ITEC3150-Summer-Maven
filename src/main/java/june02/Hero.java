package june02;

import java.util.*;

public class Hero implements Comparable {
    private String name;
    private int age;
    private String homeTown;

    public Hero(String name, int age, String homeTown) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;
        Hero hero = (Hero) o;
        return getAge() == hero.getAge() &&
                getName().equals(hero.getName()) &&
                getHomeTown().equals(hero.getHomeTown());
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = 31*hash + name.hashCode();
        hash = 31*hash + homeTown.hashCode();
        hash = 31*hash + ((Integer)age).hashCode();
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        Hero h = (Hero) o;
        return this.getHomeTown().compareTo( h.getHomeTown() );
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Hero> myHeroes = new ArrayList<Hero>();
        myHeroes.add( new Hero("Spiderman",16,"NYC"));
        myHeroes.add( new Hero("Ironman", 45, "Ironman Town"));
        myHeroes.add( new Hero("teddy", 2, "Lawrenceville"));
        Collections.sort(myHeroes);
        System.out.println(myHeroes);
        TreeMap<String,Hero> map = new TreeMap<>();
    }
}
