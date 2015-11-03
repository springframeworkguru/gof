package guru.springframework.gof.mediator.colleague;

import guru.springframework.gof.mediator.mediator.Commander;

public class TankUnit implements ArmedUnit{
    private Commander commander;
    public TankUnit(Commander commander){
        this.commander=commander;
    }
    @Override
    public void  attack()
    {
        if(commander.canAttack())
        {
            System.out.println("TankUnit: Attacking.....");
            commander.setAttackStatus(false);
        }
        else{
            System.out.println("TankUnit: Cannot attack now. Other units attacking....");
        }
    }
    @Override
    public void  stopAttack(){
        System.out.println("TankUnit: Stopped attacking.....");
        commander.setAttackStatus(true);
    }
}
