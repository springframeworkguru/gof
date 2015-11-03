package guru.springframework.gof.mediator.mediator;


import guru.springframework.gof.mediator.colleague.ArmedUnit;
import guru.springframework.gof.mediator.colleague.SoldierUnit;
import guru.springframework.gof.mediator.colleague.TankUnit;

public interface Commander {
   void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
