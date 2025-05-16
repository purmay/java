public class MentoringProgram {
    public static void main(String[] args) {
        // 멘토 한 명 만들기
        Mentor mentorKim = new Mentor("김멘토");

        // 멘티 두 명 만들기
        Mentee menteeA = new Mentee("홍길동");
        Mentee menteeB = new Mentee("김철수");

        // 홍길동이 김멘토를 멘토로 선택
        menteeA.setMentor(mentorKim);
        mentorKim.addMentee(menteeA);

        // 김철수도 김멘토를 멘토로 선택
        menteeB.setMentor(mentorKim);
        mentorKim.addMentee(menteeB);

        // 멘토가 누구랑 연결됐는지 보기
        mentorKim.showMentees();
    }
}
