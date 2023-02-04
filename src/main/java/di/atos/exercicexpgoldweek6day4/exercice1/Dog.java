/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day4.exercice1;

public class Dog {
        private int time;
    
    public void setDrinkTime(int time) {
        this.time = time;
    }

    public int getDrinkTime() {
        return this.time;
    }

    /**
     * The dog needs to go for a walk if it had a drink more than 4 hours ago;
     * i.e., if getDrinkTime() returns a value > 4.
     */
    public boolean needsToGo() {
        if(getDrinkTime() > 4) {
            return true;
        }
        return false;
    }
}
