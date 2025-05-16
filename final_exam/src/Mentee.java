public class Mentee extends Person {
    Mentor mentor;

    public Mentee(String name) {
        super(name);
    }

    // 멘토 설정
    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
        System.out.println(name + " 멘티가 " + mentor.name + " 멘토를 선택했어요!");
    }
}
