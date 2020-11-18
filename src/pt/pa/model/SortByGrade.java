package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByGrade implements GradeSorting, Comparator<StudentGrade> {

    public int compare(StudentGrade a, StudentGrade b){
        return a.getGrade() - b.getGrade();
    }

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByGrade());
    }


}
