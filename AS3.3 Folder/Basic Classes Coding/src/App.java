public class App {

    //main method here serves to test concrete instances of skill classes 
    public static void main(String[] args) throws Exception {
        //implements all concrete instances of abstract skill class
        //then calls identify skill method to test their output
        HardSkill hard = new HardSkill("Data Analysis", "hard", 4); 
        hard.identifySkill(); 

        SoftSkill soft = new SoftSkill("Creativity", "soft", 7); 
        soft.identifySkill(); 
        
        GiftSkill gift = new GiftSkill("Empathy", "gift", 8); 
        gift.identifySkill();

        TalentSkill talent = new TalentSkill("Musical Intelligence", "talent", 6);
        talent.identifySkill(); 
    }
}