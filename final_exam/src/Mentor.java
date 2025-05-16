import java.util.ArrayList;
import java.util.List;

public class Mentor extends Person {  // ← 여기 괄호 { 반드시 필요해
    List<Mentee> mentees = new ArrayList<>();

    public Mentor(String name) {
        super(name);
    }

    public void addMentee(Mentee mentee) {
        mentees.add(mentee);
        System.out.println(name + " 멘토가 " + mentee.name + " 멘티를 추가했어요!");
    }

    public void showMentees() {
        System.out.println(name + " 멘토의 멘티 목록:");
        for (Mentee m : mentees) {
            System.out.println("- " + m.name);
        }
    }
}
