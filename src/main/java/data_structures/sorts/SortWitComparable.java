package data_structures.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>19/01/2020</pre>
 */
class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private Double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int lastCmp = cgpa.compareTo(o.cgpa);
//        if (lastCmp == 0) return fname.compareTo(o.fname);
        return (lastCmp >0 ? lastCmp: fname.compareTo(o.fname));
    }
}

//Complete the code
public class SortWitComparable {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
//        while (testCases > 0) {
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));



        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
