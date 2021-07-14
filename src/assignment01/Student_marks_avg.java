package assignment01;

public class Student_marks_avg {

    public void main(String[] args) {
        Student s[] = new Student[5];
        int marksSum = 0;
        int subjectCode = 1;
        for(int i=0;i<5;i++){
            s[i]=new Student();
            marksSum += s[i].marks[subjectCode];
        }
        System.out.println("Average marks scored in " + subjectCode + " are" + (double)marksSum/s.length);
    }
}
