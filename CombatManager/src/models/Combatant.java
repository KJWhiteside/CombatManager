/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combatmanager.models;

/**
 *
 * @author Kevin
 */
public class Combatant
{
    private int initiativeScore;
    private int initiativeModifier;
    private String name;

    
    public Combatant()
    {
        this.initiativeScore = 0;
        this.initiativeModifier = 0;
        this.name = "Unnamed Combatant";
    }
    
    public Combatant(int mod, String n)
    {
        this.initiativeScore = 0;
        this.initiativeModifier = mod;
        this.name = n;
    }
    

    @Override
    public String toString()
    {
        if (this.initiativeModifier < 0)
        {
            
        }
        return this.name + " (" + this.initiativeModifier + ")";
    }
    
    /**
     * @return the initiativeScore
     */
    public int getInitiativeScore()
    {
        return initiativeScore;
    }

    /**
     * @param initiativeScore the initiativeScore to set
     */
    public void setInitiativeScore(int initiativeScore)
    {
        this.initiativeScore = initiativeScore;
    }

    /**
     * @return the initiativeModifier
     */
    public int getInitiativeModifier()
    {
        return initiativeModifier;
    }

    /**
     * @param initiativeModifier the initiativeModifier to set
     */
    public void setInitiativeModifier(int initiativeModifier)
    {
        this.initiativeModifier = initiativeModifier;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

}