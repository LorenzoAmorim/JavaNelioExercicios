package IntrudocaoPOO.Poo3.entities;

public class Students {
    public String name;
    public double primeiro;
    public double segundo;
    public double terceiro;

    public double finalGrade(){
        return primeiro + segundo + terceiro;
    }

    public double approvedOrMissing(){
        if(finalGrade() < 60){
            return 60.00 - finalGrade();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "FINAL GRADE = " +
                finalGrade();
    }
}
