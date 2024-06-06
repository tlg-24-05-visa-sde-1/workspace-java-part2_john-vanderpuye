package com.entertainment;

import java.util.Objects;
/*
 * NOTE: to be "consistent with equals, " you must use the same sort key(s)
 * as you're using in your equals() method - for us, that's (brand, volume)
 * Natural order is defined by brand(String), and then by volume (int)
 * when tied with brand
 */
public class Television implements Comparable<Television>{
    //instnace fields
    private String brand;
    private int volume;

    // Television has-a tuner (for all things related to channel changing.)
    private final Tuner tuner = new Tuner(); // instantiated nternally, NOT exposed

    public Television() {
        super();
    }

    // constructors
    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public int getCurrentChannel() {
        return tuner.getChannel(); // delegate to contained Tuner object
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    public String getBrand() {
        return brand;
    }

    // accessor methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Television other = (Television) obj;
        return this.getVolume() == other.getVolume() &&
                Objects.equals(this.getBrand(), other.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume);
    }

    /*@Override
    public int hashCode() {
        // this is a poor hash function, because it easily yields "hash collisions"
        //return getBrand().length() + getVolume();

        // this is a "scientifically correct" hash function, i.e.,
        // it minimizes the probability of hash collisions
        return Objects.hash(getBrand(), getVolume());

    }*/

    /*@Override
    public boolean equals(Object obj) {
        boolean result = false;

        // check that 'obj' is really referring to a Television object, then we proceed
        // if (obj instanceof Television) {
        if (this.getClass() == obj.getClass()) { // are we the EXACT SAME TYPE?

            // downcast 'obj' to more specific reference type Television
            Television other = (Television) obj;

            // do the checks; business equality is defined as brand, volume
            result = Objects.equals(this.getBrand(), other.getBrand()) && // null-safe check
                    this.getVolume() == other.getVolume();
        }

        return result;
    }*/

    @Override
    public int compareTo(Television other) {
        int result = this.getBrand().compareTo(other.getBrand());
        if (result == 0) {
            result = Integer.compare(this.getVolume(), other.getVolume());
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s: brand=%s, volume=%d. currentChannel=%s",
                this.getClass().getSimpleName(), getBrand(), getVolume(), getCurrentChannel());
    }


}