package pt.pa.model;

import java.util.List;

public class LowestGrade implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        int lowestGrade = grades.get(0).getGrade();

        if(grades.isEmpty())
            return -1;

        for (StudentGrade grade : grades) {
            if(grade.getGrade() < lowestGrade )
                lowestGrade = grade.getGrade();
        }
        
        return lowestGrade * 1.0;
    }
}
