package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByID implements GradeSorting, Comparator<StudentGrade> {

    public int compare(StudentGrade a, StudentGrade b){
        return a.getId().compareTo(b.getId());
    }

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByID());
    }

}
