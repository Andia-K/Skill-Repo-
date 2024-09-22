public class SoftSkill extends Skill{
    //represents a hard skill such as programming 

    public SoftSkill(String type, String name, int skillLevel){
        this.type = type; 
        this.name = name; 
        this.skillLevel = skillLevel; 
    }

    String type; 
    String name; 
    int skillLevel; 

    String getType(){
        return type; 
    }

    String getName(){
        return name; 
    }

    int getSkillLevel(){
        return skillLevel;
    }

    public void identifySkill(){
        System.out.println(this.getSkillLevel() + " of " + this.getType() + " has a level of " + this.getSkillLevel());
    }    
}
