abstract class Skill {
    //this is the abstract class. 
    //has constructor to initialize attributes name, type, and skill level
    //  constructor also has getter methods to retrieve values
    //create abstract method called identify skill that outputs to terminal 
    String name; 
    String type; 
    int skillLevel; 

    void Skill(String name, String type, int skillLevel){
        this.name = name; 
        this.type = type; 
        this.skillLevel = skillLevel; 
    }

  
    abstract String getName(); 
    abstract String getType(); 
    abstract void identifySkill(); 
}



/* 
public static void main(String[] args){
    //using for debugging
    //TODO remove this method later
}
*/