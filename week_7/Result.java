package week_7;

public class Result {
    int subject1, subject2, subject3;

    public Result() {
        
    }

    public Result(int s1, int s2, int s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    void displayResult() {
        int total = subject1 + subject2 + subject3;
        System.out.println("Total Marks: " + total);
    }
}
