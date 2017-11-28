package student;

public class Student {
	private int score;
    public Student (int score) {this.score=score;}
    public Student (int score, int bonus) {score=score+bonus; this.score=score;}
    public Student () {score=100;}
    public int getScore() {return score;}
}
