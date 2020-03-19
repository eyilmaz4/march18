package march18Codes;

public class Interview {
    private String candidate_name;
    private int candidate_score;
    private boolean final_decision;
    private int java_point;
     private int SQL_point;
    private int softSkills_point;

    public Interview(String candidate_name, int candidate_score, boolean final_decision, int java_point, int SQL_point, int softSkills_point){
this.candidate_name= candidate_name;
this.candidate_score=this.candidate_score;
this.final_decision=final_decision;
this.java_point=java_point;
this.SQL_point=SQL_point;
this.softSkills_point=softSkills_point;
    }

    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    public int getCandidate_score() {
        return candidate_score;
    }

    public void setCandidate_score(int candidate_score) {
        this.candidate_score = candidate_score;
    }

    public boolean isFinal_decision() {
        return final_decision;
    }

    public void setFinal_decision(boolean final_decision) {
        this.final_decision = final_decision;
    }

    public int getJava_point() {
        return java_point;
    }

    public void setJava_point(int java_point) {
        this.java_point = java_point;
    }

    public int getSQL_point() {
        return SQL_point;
    }

    public void setSQL_point(int SQL_point) {
        this.SQL_point = SQL_point;
    }

    public int getSoftSkills_point() {
        return softSkills_point;
    }

    public void setSoftSkills_point(int softSkills_point) {
        this.softSkills_point = softSkills_point;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "candidate_name='" + candidate_name + '\'' +
                ", candidate_score=" + candidate_score +
                ", final_decision=" + final_decision +
                ", java_point=" + java_point +
                ", SQL_point=" + SQL_point +
                ", softSkills_point=" + softSkills_point +
                '}';
    }

    public int calculate_Score(){
        int score=this.java_point+this.SQL_point+this.softSkills_point;
        return score;
    }
    public boolean decision(){
        if(calculate_Score()>=100){
            final_decision=true;
        }
        return final_decision;
    }
}
