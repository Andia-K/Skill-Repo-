public class GiftSkill extends Skill {
    //represents skills that are considered natural gifts

    //constructor class - initializes all variables
    public GiftSkill(String name, String type, int skillLevel){
        this.name = name; 
        this.type = type; 
        this.skillLevel = skillLevel;
    }

    //implementation of abstract class
    public void identifySkill(){
        System.out.println(this.getType() + " Skill of " + this.getName() + " has a level of " + this.getSkillLevel());
    }


}