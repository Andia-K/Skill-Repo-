public class HardSkill implements Skill{
    //represents hard skills

    //constructor class
    public HardSkill(String name, String type, int skillLevel){
        this.name = name; 
        this.type = type; 
        this.skillLevel = skillLevel;
    }

    //implementation of abstract method
    public void identifySkill(){
        System.out.println(this.getSkillLevel() + " of " + this.getType() + " has a level of " + this.getSkillLevel());
    }
}