/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatmanager.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Kevin
 */
public class CombatantList extends AbstractListModel
{

    private ArrayList<Combatant> combatants;

    public CombatantList()
    {
        combatants = new ArrayList<>();
    }

    @Override
    public int getSize()
    {
        return combatants.size();
    }

    @Override
    public Object getElementAt(int index)
    {
        return combatants.get(index);
    }

    public void addCombatant(Combatant c)
    {
        combatants.add(c);
    }

    public List<Combatant> getCombatants()
    {
        return this.combatants;
    }

}
