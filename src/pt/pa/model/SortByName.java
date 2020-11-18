package pt.pa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements GradeSorting, Comparator<StudentGrade> {

    public int compare(StudentGrade a, StudentGrade b){
        return a.getName().compareTo(b.getName());
    }

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByName());
    }
}
