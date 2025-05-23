package com.redshift.ShadowDarkCalculator.creatures;

import com.redshift.ShadowDarkCalculator.actions.Action;
import com.redshift.ShadowDarkCalculator.conditions.Condition;
import com.redshift.ShadowDarkCalculator.targets.SingleTargetSelector;
import java.util.List;
import java.util.Set;

public interface Creature {
    /**
     * Add the specified condition to the character.
     */

    void addCondition(Condition condition);

    /**
     * Remove the specified condition that has been eliminated via some specific means
     */

    void clearCondition(String conditionName);

    /**
     * Returns true if the creature can act.
     */

    boolean canAct();

    /**
     * Returns the AC of the creature.
     */

    int getAC();

    /**
     * Gets the creatures action..
     */

    Action getAction();

    /**
     * Returns the creatures current hit points.
     */

    int getCurrentHitPoints();

    /**
     * Returns the creatures name.
     */

    String getName();

    /**
     * Returns a list of labels for the creature.
     */

    Set<Label> getLabels();

    /**
     * Returns the target selector strategy for enemies.
     */

    SingleTargetSelector getSingleTargetSelector();

    /**
     * Returns the creatures initiative
     */

    int rollInitiative();

    /**
     * Returns the level of the creature.
     */

    int getLevel();

    /**
     * Returns the creatures maximum hit points.
     */

    int getMaxHitPoints();

    /**
     * Returns the creatures stats.
     */

    Stats getStats();

    /**
     * Reports a status of the creature; unconscious, dead, alive, etc.
     */

    String getStatus();

    /**
     * Returns the amount of hit points from maximum.
     */

    int getWoundedAmount();

    /**
     * Returns true if teh creature already has the specified condition.
     */

    boolean hasCondition(String conditionName);

    /**
     * Heals the target for the specified amount.
     */

    void healDamage(int hitPoints);

    /**
     * Returns true if dead... can't be healed, can't take actions, etc.
     */

    boolean isDead();

    /*
     * Returns true if the creature has disadvantage on it's next action or check
     */

    boolean isDisadvantaged();

    /**
     * Returns true if the creature is unconscious.
     */

    boolean isUnconscious();

    /**
     * Returns true if the creature is less then full hit points.
     */

    boolean isWounded();

    /**
     * Sets whether the creature is dead or not.
     */

    void setDead(boolean dead);

    /**
     * Instructs the creature to take an amount of damage silvered or magical.
     */

    void takeDamage(
        int amount,
        boolean silvered,
        boolean magical,
        boolean fire,
        boolean cold
    );

    /**
     * Triggers any begin of turn triggers... count down timers, etc.
     */

    void takeTurn(List<Creature> enemies, List<Creature> allies);
}
